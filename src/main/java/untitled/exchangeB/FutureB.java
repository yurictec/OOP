package main.java.untitled.exchangeB;

import main.java.untitled.AbstractInstrument;

public class FutureB extends AbstractInstrument{

    private String expirationDate;

    {
        setName("Microsoft".toUpperCase());
        setTicker("MSFT");
        setPriceStrike(159.1203);
        this.expirationDate = "01-11-2017";
    }

    @Override
    public String toString() {
        return super.toString() + " " + expirationDate;
    }
}
