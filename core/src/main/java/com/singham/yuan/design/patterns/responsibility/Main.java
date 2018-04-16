package com.singham.yuan.design.patterns.responsibility;

public class Main {

    public static void main(String[] args) {

        Clerk clerk = new Clerk();

        Leader leader = new Leader();

        Manager manager = new Manager();

        clerk.setSuperior(leader);

        leader.setSuperior(manager);

        clerk.handleRequest(3000);

    }
}
