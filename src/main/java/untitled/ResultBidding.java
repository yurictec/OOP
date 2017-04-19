package main.java.untitled;

import main.java.untitled.command.CommandFactory;
import main.java.untitled.typeExchange.TypeExchange;

import java.util.ArrayList;
import java.util.List;

public class ResultBidding {

    public static List<AbstractInstrument> read(TypeExchange typeExchange) {
        List<AbstractInstrument> list = new ArrayList<>();
        CommandFactory factory = CommandFactory.getInstance();
        list.add(factory.getCommand(typeExchange).exequteFuture());
        list.add(factory.getCommand(typeExchange).exequteOption());
        list.add(factory.getCommand(typeExchange).exequteStock());
        return list;

    }

    public static void main(String[] args) {
        System.out.println(read(TypeExchange.EXCHANGE_A));
        System.out.println(read(TypeExchange.EXCHANGE_B));
    }
}
