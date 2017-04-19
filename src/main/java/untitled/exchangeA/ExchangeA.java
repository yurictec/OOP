package main.java.untitled.exchangeA;

import main.java.untitled.AbstractInstrument;
import main.java.untitled.command.Command;

public class ExchangeA implements Command {

    @Override
    public AbstractInstrument exequteOption() {
        return new OptionA();
    }

    @Override
    public AbstractInstrument exequteFuture() {
        return new FutureA();
    }

    @Override
    public AbstractInstrument exequteStock() {
        return new StockA();
    }
}
