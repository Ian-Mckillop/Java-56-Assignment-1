package edu.school.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class ExpenseManager {
    // state
    private final ArrayList<Expense> expenseList = new ArrayList<>();

    // behaviour
    public void expenseAdd(String description, int amount, Date date, String category) {
        expenseList.add(new Expense(description, amount, date, category));
    }

    public void listExpenses() {
        int expenseCounter = 0;
        for (Expense expense: expenseList) {
            expenseCounter++;

            System.out.println(expenseCounter + ". Amount: " + expense.getAmount());
            System.out.println("   Date: " + expense.getDate());
            System.out.println("   Description: " + expense.getDescription());
            System.out.println("   Category: " + expense.getCategory() + "\n");
        }

    }

    public void listExpenses(String specificCategory) {
        int expenseCounter = 0;
        for (Expense expense: expenseList) {
            if(Objects.equals(expense.getCategory(), specificCategory)) {
                expenseCounter++;

                System.out.println(expenseCounter + ". Amount: " + expense.getAmount());
                System.out.println("   Date: " + expense.getDate());
                System.out.println("   Description: " + expense.getDescription());
                System.out.println("   Category: " + expense.getCategory() + "\n");
            }
        }

    }

    public void listExpenses(Date startDate, Date endDate) {
        int expenseCounter = 0;
        for (Expense expense: expenseList) {
            if((expense.getDate().after(startDate) || expense.getDate().equals(startDate)) && (expense.getDate().before(endDate) || expense.getDate().equals(endDate))) {
                expenseCounter++;

                System.out.println(expenseCounter + ". Amount: " + expense.getAmount());
                System.out.println("   Date: " + expense.getDate());
                System.out.println("   Description: " + expense.getDescription());
                System.out.println("   Category: " + expense.getCategory() + "\n");
            }
        }

    }

    public void removeExpense(int expenseToRemove) {
        expenseList.remove(expenseToRemove - 1);
    }
}
