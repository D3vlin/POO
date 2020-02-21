package com.iumafis.tallerpractico.model;

import java.util.Date;

public final class NewcomerProduct extends Product {
    
    private Date packingDate;
    private String city;

    public NewcomerProduct(Date packingDate, String city, Date expirationDate, int barcode) {
        super(expirationDate, barcode);
        this.packingDate = packingDate;
        this.city = city;
    }

    public Date getPackingDate() {
        return packingDate;
    }

    public void setPackingDate(Date packingDate) {
        this.packingDate = packingDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {        
        return super.toString() + " = NewcomerProduct{" + "packingDate=" + packingDate + ", city=" + city + '}';
    }
    
    
}
