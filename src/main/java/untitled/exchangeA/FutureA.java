package main.java.untitled.exchangeA;

import main.java.untitled.AbstractInstrument;

public class FutureA extends AbstractInstrument{

    private String expirationDate;

    {
        setName("Microsoft");
        setTicker("MSFT");
        setPriceStrike(123.1004);
        this.expirationDate = "2017-01-11";
    }

    @Override
    public String toString() {
        return  super.toString() + " " + expirationDate;
    }
}
