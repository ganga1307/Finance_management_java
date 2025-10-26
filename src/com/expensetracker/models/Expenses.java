package com.expensetracker.models;
import java.time.LocalDate;

public class Expenses {
    private String spendOn;
    private double amount;
    private LocalDate date;


    public Expenses(String spendOn, double amount) {
        this.spendOn = spendOn;
        this.amount = amount;
        this.date = date;
    }


    public String getSpendOn() {
        return spendOn;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }
}
