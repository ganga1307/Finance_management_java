package com.expensetracker.models;
import java.time.LocalDate;

public class Expenses {
    private final String spendOn;
    protected double amount;
    private LocalDate date;


    public Expenses(String spendOn, double amount) {
        this.spendOn = spendOn;
        this.amount = amount;
        this.date=date;
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
