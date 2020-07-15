
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package eu.europa.ec.webapi;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 3.3.7
 * 2020-07-15T16:10:03.163+02:00
 * Generated source version: 3.3.7
 *
 */

@javax.jws.WebService(
                      serviceName = "checkVatService",
                      portName = "checkVatPort",
                      targetNamespace = "urn:ec.europa.eu:taxud:vies:services:checkVat",
                      wsdlLocation = "https://ec.europa.eu/taxation_customs/vies/checkVatService.wsdl",
                      endpointInterface = "eu.europa.ec.webapi.CheckVatPortType")

public class CheckVatPortImpl implements CheckVatPortType {

    private static final Logger LOG = Logger.getLogger(CheckVatPortImpl.class.getName());

    /* (non-Javadoc)
     * @see eu.europa.ec.webapi.CheckVatPortType#checkVatApprox(java.lang.String countryCode, java.lang.String vatNumber, java.lang.String traderName, java.lang.String traderCompanyType, java.lang.String traderStreet, java.lang.String traderPostcode, java.lang.String traderCity, java.lang.String requesterCountryCode, java.lang.String requesterVatNumber, javax.xml.datatype.XMLGregorianCalendar requestDate, java.lang.Boolean valid, java.lang.String traderAddress, java.lang.String traderNameMatch, java.lang.String traderCompanyTypeMatch, java.lang.String traderStreetMatch, java.lang.String traderPostcodeMatch, java.lang.String traderCityMatch, java.lang.String requestIdentifier)*
     */
    public void checkVatApprox(javax.xml.ws.Holder<java.lang.String> countryCode, javax.xml.ws.Holder<java.lang.String> vatNumber, javax.xml.ws.Holder<java.lang.String> traderName, javax.xml.ws.Holder<java.lang.String> traderCompanyType, javax.xml.ws.Holder<java.lang.String> traderStreet, javax.xml.ws.Holder<java.lang.String> traderPostcode, javax.xml.ws.Holder<java.lang.String> traderCity, java.lang.String requesterCountryCode, java.lang.String requesterVatNumber, javax.xml.ws.Holder<javax.xml.datatype.XMLGregorianCalendar> requestDate, javax.xml.ws.Holder<java.lang.Boolean> valid, javax.xml.ws.Holder<java.lang.String> traderAddress, javax.xml.ws.Holder<java.lang.String> traderNameMatch, javax.xml.ws.Holder<java.lang.String> traderCompanyTypeMatch, javax.xml.ws.Holder<java.lang.String> traderStreetMatch, javax.xml.ws.Holder<java.lang.String> traderPostcodeMatch, javax.xml.ws.Holder<java.lang.String> traderCityMatch, javax.xml.ws.Holder<java.lang.String> requestIdentifier) {
        LOG.info("Executing operation checkVatApprox");
        System.out.println(countryCode.value);
        System.out.println(vatNumber.value);
        System.out.println(traderName.value);
        System.out.println(traderCompanyType.value);
        System.out.println(traderStreet.value);
        System.out.println(traderPostcode.value);
        System.out.println(traderCity.value);
        System.out.println(requesterCountryCode);
        System.out.println(requesterVatNumber);
        try {
            javax.xml.datatype.XMLGregorianCalendar requestDateValue = null;
            requestDate.value = requestDateValue;
            java.lang.Boolean validValue = null;
            valid.value = validValue;
            java.lang.String traderAddressValue = "";
            traderAddress.value = traderAddressValue;
            java.lang.String traderNameMatchValue = "";
            traderNameMatch.value = traderNameMatchValue;
            java.lang.String traderCompanyTypeMatchValue = "";
            traderCompanyTypeMatch.value = traderCompanyTypeMatchValue;
            java.lang.String traderStreetMatchValue = "";
            traderStreetMatch.value = traderStreetMatchValue;
            java.lang.String traderPostcodeMatchValue = "";
            traderPostcodeMatch.value = traderPostcodeMatchValue;
            java.lang.String traderCityMatchValue = "";
            traderCityMatch.value = traderCityMatchValue;
            java.lang.String requestIdentifierValue = "";
            requestIdentifier.value = requestIdentifierValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.europa.ec.webapi.CheckVatPortType#checkVat(java.lang.String countryCode, java.lang.String vatNumber, javax.xml.datatype.XMLGregorianCalendar requestDate, java.lang.Boolean valid, java.lang.String name, java.lang.String address)*
     */
    public void checkVat(javax.xml.ws.Holder<java.lang.String> countryCode, javax.xml.ws.Holder<java.lang.String> vatNumber, javax.xml.ws.Holder<javax.xml.datatype.XMLGregorianCalendar> requestDate, javax.xml.ws.Holder<java.lang.Boolean> valid, javax.xml.ws.Holder<java.lang.String> name, javax.xml.ws.Holder<java.lang.String> address) {
        LOG.info("Executing operation checkVat");
        System.out.println(countryCode.value);
        System.out.println(vatNumber.value);
        try {
            javax.xml.datatype.XMLGregorianCalendar requestDateValue = null;
            requestDate.value = requestDateValue;
            java.lang.Boolean validValue = null;
            valid.value = validValue;
            java.lang.String nameValue = "";
            name.value = nameValue;
            java.lang.String addressValue = "";
            address.value = addressValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
