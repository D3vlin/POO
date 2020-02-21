package com.iumafis.tallerpractico.model;

import java.util.Date;

public abstract class Product {
    
    protected Date expirationDate;
    protected int barcode;

    public Product(Date expirationDate, int barcode) {
        this.expirationDate = expirationDate;
        this.barcode = barcode;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    @Override
    public String toString() {
        return "Product{" + "expirationDate=" + expirationDate + ", barcode=" + barcode + '}';
    }
}
