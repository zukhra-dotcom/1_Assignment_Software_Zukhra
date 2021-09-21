package com.company;

public class Main {

    public static void main(String[] args) {
        Employee merchendiser = new Merchendiser();

        merchendiser.title();
        merchendiser.HelpCustomers();

        merchendiser.setWorksWithCustomers(new WorksWithSpecialCustomers());
        merchendiser.HelpCustomers();

        System.out.println("------------------");

        Employee Boss = new Boss();
        Boss.title();
        Boss.HelpCustomers();

        System.out.println("------------------");

        ShopAssistant shopAssistant = new ShopAssistant();
        shopAssistant.title();
        shopAssistant.HelpCustomers();

        System.out.println("------------------");

        ReserveEmployee reserveEmployee = new ReserveEmployee();
        reserveEmployee.title();
        reserveEmployee.HelpCustomers();

        reserveEmployee.setWorksWithCustomers(new WorksWithSpecialCustomers());
        reserveEmployee.HelpCustomers();

    }
}
