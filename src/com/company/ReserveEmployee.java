package com.company;

public class ReserveEmployee extends Employee{
    public ReserveEmployee() {
        super(new NoCustomers());
    }

    @Override
    public void title(){
        System.out.println("I am a reserve employee");
    }
}
