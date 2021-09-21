package com.company;

public abstract class Employee {
    public abstract void title();

    private WorksWithCustomers worksWithCustomers;

    public Employee(WorksWithCustomers worksWithCustomers) {
        this.worksWithCustomers = worksWithCustomers;
    }

    public void HelpCustomers(){
        this.worksWithCustomers.customers();
    }

    public WorksWithCustomers getWorksWithCustomers() {
        return worksWithCustomers;
    }

    public void setWorksWithCustomers(WorksWithCustomers worksWithCustomers){
        this.worksWithCustomers = worksWithCustomers;
    }
}
