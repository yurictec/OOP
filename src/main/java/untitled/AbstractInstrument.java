package main.java.untitled;

public abstract class AbstractInstrument {

    private String name;
    private String ticker;
    private double priceStrike;

    public void setName(String name) {
        this.name = name;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setPriceStrike(double priceStrike) {
        this.priceStrike = priceStrike;
    }

    @Override
    public String toString() {
        return name + " " + ticker + " " + priceStrike;
    }
}
