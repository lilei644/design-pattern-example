package com.java.chainms;

/**
 * 采购对象，主要是价格
 */
public class PurchaseRequest {
    private int Type = 0;
    private int Number = 0;
    private float Price = 0;
    private int ID = 0;

    public PurchaseRequest(int Type, int Number, float Price) {
        this.Type = Type;
        this.Number = Number;
        this.Price = Price;
    }

    public int GetType() {
        return Type;
    }

    public float GetSum() {
        return Number * Price;
    }

    public int GetID() {
        return (int) (Math.random() * 1000);
    }
}
