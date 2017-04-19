package main.java.untitled.exchangeA;

import main.java.untitled.AbstractInstrument;

public class OptionA extends AbstractInstrument{

    private String expirationDate;
    private double margin;

    {
        setName("Apple Inc");
        setTicker("AAPL");
        setPriceStrike(151.0001);
        this.expirationDate = "2017-11-30";
        this.margin = 11.1;
    }

    @Override
    public String toString() {
        return super.toString() + " " + expirationDate + " " +  margin;
    }
}
