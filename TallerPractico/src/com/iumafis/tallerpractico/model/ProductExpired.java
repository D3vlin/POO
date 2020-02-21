package com.iumafis.tallerpractico.model;

import java.util.Date;

public final class ProductExpired extends Product {
    
    private Date dateToDeliver;

    public ProductExpired(Date dateToDeliver, Date expirationDate, int barcode) {
        super(expirationDate, barcode);
        this.dateToDeliver = dateToDeliver;
    }

    public Date getDateToDeliver() {
        return dateToDeliver;
    }

    public void setDateToDeliver(Date dateToDeliver) {
        this.dateToDeliver = dateToDeliver;
    }

    @Override
    public String toString() {
        return super.toString() + " = ProductExpired{" + "dateToDeliver=" + dateToDeliver + '}';
    }
}
