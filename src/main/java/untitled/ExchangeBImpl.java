package main.java.untitled;

public class ExchangeBImpl implements DataExchange {
    private EntityExchange entityExchange;

    {
        entityExchange = new EntityExchange();
    }

    @Override
    public String getName() {
        entityExchange.setName("GAZP");
        return entityExchange.getName();
    }

    @Override
    public String getDate() {
        entityExchange.setDateString("01-03-2017");
        return entityExchange.getDateString();
    }

    @Override
    public double getPriceStrike() {
        entityExchange.setPrice(99.20003);
        return entityExchange.getPrice();
    }
}
