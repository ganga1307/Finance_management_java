package com.expensetracker;

import com.expensetracker.models.Goals;
import com.expensetracker.models.User;
import com.expensetracker.models.Expenses;
import com.expensetracker.services.ExpenseManager;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        System.out.println("==== SMART PERSONAL EXPENSE TRACKER ====");
        System.out.print("Enter your name: ");

        String name = sc.nextLine();
        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        System.out.print("Enter your monthly budget: ");
        double budget = getValidDouble(sc);

        User user = new User(name, email, budget);

        Goals goal = null; // optional goal


            System.out.println("\nMENU");
            System.out.println("1. Add Expense");
            System.out.println("2. Show Total Spent");
            System.out.println("3. Show Remaining Budget");
            System.out.println("4. Create a Goal");
            System.out.println("5. Add Savings to Goal");
            System.out.println("6. Show Goal Progress");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = (int) getValidDouble(sc);
            while (true) {

            switch (choice) {
                case 1:
                    System.out.print("Enter what you spent on: ");
                    String spendOn = sc.nextLine();
                    System.out.print("Enter amount spent: ");
                    double amount = getValidDouble(sc);
                    System.out.print("Date:");
                    LocalDate date=LocalDate.parse(sc.nextLine()
                    );
                    manager.addExpense(new Expenses(spendOn, amount));
                    System.out.println(" Expense added successfully!");
                    break;

                case 2:
                    System.out.println(" Total spent: ₹" + manager.getTotalSpent());
                    break;

                case 3:
                    double remaining = user.getMonthlyBudjet() - manager.getTotalSpent();
                    System.out.println("🪙 Remaining budget: ₹" + remaining);
                    break;

                case 4:
                    System.out.print("Enter goal name: ");
                    String goalName = sc.nextLine();
                    System.out.print("Enter target amount: ");
                    double target = getValidDouble(sc);
                    goal = new Goals(goalName, target);
                    System.out.println("Goal created successfully!");
                    break;

                case 5:
                    if (goal == null) {
                        System.out.println("No goal created yet!");
                    } else {
                        System.out.print("Enter amount to add to savings: ");
                        double saveAmt = getValidDouble(sc);
                        goal.addSavings(saveAmt);
                        System.out.println("Savings added to your goal!");
                    }
                    break;

                case 6:
                    if (goal == null) {
                        System.out.println("⚠ No goal to show progress for!");
                    } else {
                        System.out.println(" Goal: " + goal.getGoalName());
                        System.out.println("Progress: " + goal.getProgress() + "%");
                    }
                    break;

                case 7:
                    System.out.println("Exiting... Goodbye, " + user.getName() + "!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option, please try again!");
            }
        }
    }


    private static double getValidDouble(Scanner sc) {
        while (true) {
            try {
                double val = sc.nextDouble();
                sc.nextLine();
                return val;
            } catch (Exception e) {
                System.out.print("Invalid input! Please enter a valid number: ");
                sc.nextLine();
            }
        }
    }
}
