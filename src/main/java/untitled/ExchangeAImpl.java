package main.java.untitled;

public class ExchangeAImpl implements DataExchange {
    private EntityExchange entityExchange;

    {
        entityExchange = new EntityExchange();
        entityExchange.setName("MSFT");
        entityExchange.setDateString("2016-05-11");
        entityExchange.setPrice(123.40001);
    }

    @Override
    public String getName() {
        return entityExchange.getName();
    }

    @Override
    public String getDate() {
        return entityExchange.getDateString();
    }

    @Override
    public double getPriceStrike() {
        return entityExchange.getPrice();
    }
}
