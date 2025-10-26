package com.expensetracker.models;

public class Goals {
    private String goalName;
    private double targetAmount;
    private double savedAmount;

    public Goals(String goalName, double targetAmount) {
        this.goalName = goalName;
        this.targetAmount = targetAmount;
        this.savedAmount = 0;
    }

    public void addSavings(double amount) {
        this.savedAmount += amount;
    }

    public double getProgress() {
        return (savedAmount / targetAmount) * 100;
    }

    public String getGoalName() {
        return goalName;
    }
}

