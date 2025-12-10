package org.example;

import java.time.LocalDateTime;
public abstract class Payment {

    protected int amount;


    public Payment(int amount)
    {
        this.amount = amount;
    }


    public void logTransaction()
    {
        System.out.println("logging transaction. amount" + this.amount);
    }

    public abstract void processs();

}