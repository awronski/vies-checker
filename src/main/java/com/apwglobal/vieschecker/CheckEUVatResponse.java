package com.apwglobal.vieschecker;

import java.util.Date;

public class CheckEUVatResponse {

    private String vat;
    private Date date;
    private boolean valid;
    private String name;
    private String address;

    public CheckEUVatResponse(String vat) {
        this.vat = vat;
        this.date = new Date();
        this.valid = false;
        this.name = "";
        this.address = "";
    }

    public CheckEUVatResponse(String vat, Date date, boolean valid, String name, String address) {
        this.vat = vat;
        this.date = date;
        this.valid = valid;
        this.name = name;
        this.address = address;
    }

    public String getVat() {
        return vat;
    }

    public Date getDate() {
        return date;
    }

    public boolean isValid() {
        return valid;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "VatchCheckResponse{" +
                "vat='" + vat + '\'' +
                ", date=" + date +
                ", valid=" + valid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
