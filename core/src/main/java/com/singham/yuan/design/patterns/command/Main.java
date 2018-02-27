package com.singham.yuan.design.patterns.command;

public class Main {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();

        ConcreteCommand command = new ConcreteCommand(receiver);

        Requester requester = new Requester();

        requester.setCommand(command);

        requester.executeCommand();
    }
}
