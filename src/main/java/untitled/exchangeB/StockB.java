package main.java.untitled.exchangeB;

import main.java.untitled.AbstractInstrument;

public class StockB extends AbstractInstrument{

    private String expirationDate;
    private double interestRate;

    {
        setName("International Business Machines".toUpperCase());
        setTicker("IBM");
        setPriceStrike(141.1101);
        this.expirationDate = "04-15-2017";
        this.interestRate = 7.08;
    }

    @Override
    public String toString() {
        return super.toString() + " " + expirationDate + " " + interestRate;
    }
}
