package com.company;

public class WorksWithSpecialCustomers implements WorksWithCustomers {
    @Override
    public void customers(){
        System.out.println("I work with special customers");
    }
}
