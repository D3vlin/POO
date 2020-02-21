package com.iumafis.tallerpractico.model;

import java.util.Date;

public final class ProductSoonExpire extends Product {
    
    private int FoodSupervisionCode;

    public ProductSoonExpire(int FoodSupervisionCode, Date expirationDate, int barcode) {
        super(expirationDate, barcode);
        this.FoodSupervisionCode = FoodSupervisionCode;
    }

    public int getFoodSupervisionCode() {
        return FoodSupervisionCode;
    }

    public void setFoodSupervisionCode(int FoodSupervisionCode) {
        this.FoodSupervisionCode = FoodSupervisionCode;
    }

    @Override
    public String toString() {
        return super.toString() + " = ProductSoonExpire{" + "FoodSupervisionCode=" + FoodSupervisionCode + '}';
    }
}
