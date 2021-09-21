package com.company;

public class Merchendiser extends Employee{
    public Merchendiser() {
        super(new NoCustomers());
    }

    @Override
    public void title(){
        System.out.println("I am a merchendiser");
    }
}
