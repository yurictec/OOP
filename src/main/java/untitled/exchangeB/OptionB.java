package main.java.untitled.exchangeB;

import main.java.untitled.AbstractInstrument;

public class OptionB extends AbstractInstrument {

    private String expirationDate;
    private int margin;

    {
        setName("Apple Inc");
        setTicker("AAPL");
        setPriceStrike(101.5041);
        this.expirationDate = "11-30-2017";
        this.margin = 15;
    }

    @Override
    public String toString() {
        return super.toString() + " " + expirationDate + " " + margin;
    }
}
