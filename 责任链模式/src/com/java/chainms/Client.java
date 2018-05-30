package com.java.chainms;

/**
 * 责任链模式，客户端购买请求对象
 */
public class Client {

    public Client() {

    }

    public PurchaseRequest sendRequst(int Type, int Number, float Price) {
        return new PurchaseRequest(Type, Number, Price);
    }

}
