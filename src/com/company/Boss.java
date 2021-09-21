package com.company;

public class Boss extends Employee{
    public Boss() {
        super(new NoCustomers());
    }

    @Override
    public void title(){
        System.out.println("I am a boss");
    }
}
