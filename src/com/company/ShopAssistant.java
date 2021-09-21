package com.company;

public class ShopAssistant extends Employee{

    public ShopAssistant() {
        super(new WithCustomers());
    }

    @Override
    public void title(){
        System.out.println("I am a shop assistant");
    }

}
