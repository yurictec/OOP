package main.java.untitled.exchangeB;

import main.java.untitled.AbstractInstrument;
import main.java.untitled.command.Command;

public class ExchangeB implements Command {

    @Override
    public AbstractInstrument exequteOption() {
        return new OptionB();
    }

    @Override
    public AbstractInstrument exequteFuture() {
        return new FutureB();
    }

    @Override
    public AbstractInstrument exequteStock() {
        return new StockB();
    }
}
