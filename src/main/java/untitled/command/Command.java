package main.java.untitled.command;

import main.java.untitled.AbstractInstrument;

public interface Command {
    AbstractInstrument exequteOption();
    AbstractInstrument exequteFuture();
    AbstractInstrument exequteStock();
}
