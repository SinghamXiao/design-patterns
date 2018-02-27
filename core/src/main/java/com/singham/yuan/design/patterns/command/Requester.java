package com.singham.yuan.design.patterns.command;

public class Requester {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

}
