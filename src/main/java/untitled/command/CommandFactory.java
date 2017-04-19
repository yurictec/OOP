package main.java.untitled.command;

import main.java.untitled.exchangeA.ExchangeA;
import main.java.untitled.exchangeB.ExchangeB;
import main.java.untitled.typeExchange.TypeExchange;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    private final Map<TypeExchange, Command> map = new HashMap<>();


    private CommandFactory() {
        map.put(TypeExchange.EXCHANGE_A, new ExchangeA());
        map.put(TypeExchange.EXCHANGE_B, new ExchangeB());

    }

    private static class CommandFactoryHolder {
        private static final CommandFactory FACTORY = new CommandFactory();
    }

    public static CommandFactory getInstance() {
        return CommandFactoryHolder.FACTORY;
    }

    public Command getCommand(TypeExchange key) {
        return map.get(key);
    }
}
