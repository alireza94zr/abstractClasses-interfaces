package org.example;

public class CreditCardPayment extends Payment implements SecureTransaction  {



    public CreditCardPayment(int amount)
    {
        super(amount);
    }

    @Override
    public boolean authenticate()  //احراز هویت
    {

        return true;
    }



    public void processs(){      //روند

        if(authenticate())
        {
            System.out.println("processing credit card payment of "+amount);
            logTransaction();
        }else{
            System.out.println("authentication failed!");
        }

    }
}