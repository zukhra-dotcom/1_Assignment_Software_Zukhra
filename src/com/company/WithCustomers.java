package com.company;

public class WithCustomers implements WorksWithCustomers{
    @Override
    public void customers(){
        System.out.println("I work with customers");
    }
}
