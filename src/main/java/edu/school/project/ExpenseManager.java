package edu.school.project;

import java.util.ArrayList;

public class ExpenseManager {
    // state
    ArrayList<Expense> expenseList = new ArrayList<>();

    // behaviour
    void expenseAdd(String description, int amount, int date, String category) {
        expenseList.add(new Expense(description, amount, date, category));
    }

    void listExpenses() {
        for (Expense expense: expenseList) {
            System.out.println(expense.getAmount());
        }

    }
}
