package com.expensetracker.services;

import com.expensetracker.models.Expenses;
import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<Expenses> expenses = new ArrayList<>();

    public void addExpense(Expenses expense) {
        expenses.add(expense);
    }

    public double getTotalSpent() {
        double total = 0;
        for (Expenses e : expenses) {
            total += e.getAmount();
        }
        return total;
    }

    public List<Expenses> getAllExpenses() {
        return expenses;
    }
}
