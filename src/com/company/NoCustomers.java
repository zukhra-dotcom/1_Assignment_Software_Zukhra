package com.company;

public class NoCustomers implements WorksWithCustomers{
    @Override
    public void customers(){
        System.out.println("I don`t work with customers");
    }
}
