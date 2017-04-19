package main.java.untitled.exchangeA;

import main.java.untitled.AbstractInstrument;

public class StockA extends AbstractInstrument {

    private String expirationDate;
    private int interestRate;

    {
        setName("International Business Machines");
        setTicker("IBM");
        setPriceStrike(139.1204);
        this.expirationDate = "2017-04-15";
        this.interestRate = 12;
    }

    @Override
    public String toString() {
        return super.toString() + " " + expirationDate + " " + interestRate;
    }
}
