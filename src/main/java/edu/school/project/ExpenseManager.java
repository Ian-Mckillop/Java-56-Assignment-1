package edu.school.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class ExpenseManager {
    // stores a list of expenses
    private final ArrayList<Expense> expenseList = new ArrayList<>();

    /**
     * creates and adds an expense to the expenseList, based on the given parameters
     */
    public void expenseAdd(String description, int amount, Date date, String category) {
        expenseList.add(new Expense(description, amount, date, category));
    }


    /**
     * prints all expenses contained in the expenseList to the console
     */
    public void listExpenses() {
        int expenseCounter = 0;
        // outputs each expense in expenseList
        for (Expense expense: expenseList) {
            expenseCounter++;

            System.out.println(expenseCounter + ". Amount: " + expense.getAmount());
            System.out.println("   Date: " + expense.getDate());
            System.out.println("   Description: " + expense.getDescription());
            System.out.println("   Category: " + expense.getCategory() + "\n");
        }

    }
    /**
     * prints all expenses of a specific category contained in the expenseList to the console
     */
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
    /**
     * prints all expenses within a certain time period contained in the expenseList to the console
     */
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
    /**
     * removes a specified expense from the expense list
     */
    public void removeExpense(int expenseToRemove) {
        expenseList.remove(expenseToRemove - 1);
    }
    /**
     * returns a total of all expenses, within a certain time period, within the expenseList
     */
    public int totalExpenses(Date startOfExpenses, Date endOfExpenses) {
        int totalExpenses = 0;
        for (Expense expense: expenseList) {
            if((expense.getDate().after(startOfExpenses) || expense.getDate().equals(startOfExpenses)) && (expense.getDate().before(endOfExpenses) || expense.getDate().equals(endOfExpenses))) {
                totalExpenses += expense.getAmount();
            }
        }
        return totalExpenses;
    }
}
