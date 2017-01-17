package com.apwglobal.vieschecker;

import eu.europa.ec.webapi.CheckVatService;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;

public class CheckEUVatService {

    private static final String WSDL = "http://ec.europa.eu/taxation_customs/vies/checkVatService.wsdl";

    public static final String[] ERRORS = {
                "SERVICE_UNAVAILABLE",
                "MS_UNAVAILABLE",
                "TIMEOUT",
                "SERVER_BUSY",
                "MS_MAX_CONCURRENT_REQ"
    };

    public static final String INVALID_INPUT_ERROR = "INVALID_INPUT";
    public static final String UNKNOWN_ERROR = "UNKNOWN";


    private CheckVatService checkVatService;

    public CheckEUVatService() {
        try {
            this.checkVatService = new CheckVatService(new URL(WSDL));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public CheckEUVatResponse check(String vat) throws CheckEUVatException {

        if (!isValid(vat)) {
            return new CheckEUVatResponse(vat);
        }

        String full = vat.replaceAll("\\W", "").toUpperCase();

        String country = full.substring(0, 2);
        String number = full.substring(2);

        Holder<String> countryCode = new Holder<>(country);
        Holder<String> vatNumber = new Holder<>(number);
        Holder<XMLGregorianCalendar> reqDate = new Holder<>();
        Holder<Boolean> valid = new Holder<>();
        Holder<String> name = new Holder<>();
        Holder<String> address = new Holder<>();

        try {
            checkVatService.getCheckVatPort().checkVat(countryCode, vatNumber, reqDate, valid, name, address);
        } catch (WebServiceException ex) {
            return processException(full, ex);
        }

        Date date = reqDate.value.toGregorianCalendar().getTime();

        return new CheckEUVatResponse(country + number, date, valid.value, name.value, address.value);
    }

    private boolean isValid(String vat) {
        return vat != null && vat.replaceAll("\\W", "").length() > 3;
    }

    private CheckEUVatResponse processException(String vat, WebServiceException ex) throws CheckEUVatException {
        if (ex.getMessage().contains(INVALID_INPUT_ERROR)) {
            return new CheckEUVatResponse(vat);
        }

        throw Arrays.stream(ERRORS)
                .filter(e -> ex.getMessage().contains(e))
                .findAny()
                .map(CheckEUVatException::new)
                .orElseGet(() -> new CheckEUVatException(UNKNOWN_ERROR));
    }

}
