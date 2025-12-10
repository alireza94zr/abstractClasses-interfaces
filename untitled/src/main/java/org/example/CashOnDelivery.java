package org.example;

public class CashOnDelivery  extends Payment{
    private String address;

    public CashOnDelivery(int amount,String address)
    {
        super(amount);
        this.address = address;
    }



    public void processs()
    {
        System.out.println("paying on delivery to"+this.address);
        logTransaction();

    }


}