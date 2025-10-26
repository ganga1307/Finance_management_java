package com.expensetracker.models;

public class User {
    private String name;
    private String email;
    private double MonthlyBudjet;
     public User(String name, String email, double MonthlyBudjet){
        this.name=name;
        this.email=email;
        this.MonthlyBudjet=MonthlyBudjet;
    }
    public String getName(){
        return name;
    }
    public String getEmail() {
        return email;
    }
    public double getMonthlyBudjet(){
        return MonthlyBudjet;
    }
    public void setMonthlyBudjet(double MonthlyBudjet){
        this.MonthlyBudjet=MonthlyBudjet;
    }
}
