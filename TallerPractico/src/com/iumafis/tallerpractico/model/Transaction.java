package com.iumafis.tallerpractico.model;

abstract class Transaction {
    
    protected float value;

    public Transaction() { }

    public Transaction(float value) { this.value = value; }

    public float getValue() { return value; }

    public void setValue(float value) { this.value = value; }
}
