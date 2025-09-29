package edu.school.project;

import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        boolean closeProgram = false;
        ExpenseManager expenseTracker = new ExpenseManager();
        System.out.println("Hello and welcome to this Expense Tracker!");
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("Would you like to:");
        System.out.println("1. Add a new expense?");
        System.out.println("2. Remove an expense?");
        System.out.println("3. Look at all your current expenses?");
        System.out.println("4. Look at all the expenses in a specific category?");
        System.out.println("5. Look at all the expenses in a specific period of time?");
        System.out.println("6. Exit the Expense Tracker?");
        int option = scanner.nextInt();

        switch(option) {
            case 1:
                System.out.println("To enter a new expense, please add a description:");
                String description = scanner.next();
                System.out.println("Please add an amount:");
                int amount = scanner.nextInt();
                Date date = getDate();
                System.out.println("Please add a category:");
                String category = scanner.next();
                expenseTracker.expenseAdd(description, amount, date, category);
                System.out.println("Expense Added! \n");
                break;
            case 2:
                System.out.println("Please enter the number corresponding to the expense you would like to remove:");
                int expenseToRemove = scanner.nextInt();
                expenseTracker.removeExpense(expenseToRemove);
                break;
            case 3:
                System.out.println("Outputting all expenses!");
                expenseTracker.listExpenses();
                break;
            case 4:
                System.out.println("What category would you like the expenses for?");
                String specificCategory = scanner.next();
                expenseTracker.listExpenses(specificCategory);
                break;
            case 5:
                System.out.println("What period of time would you like the expenses for?");
                Date startDate  = getDate();
                Date endDate = getDate();
                expenseTracker.listExpenses(startDate, endDate);
                break;
            case 6:
                closeProgram = true;
        }
        } while(!closeProgram);
    }

    public static Date getDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add a date, starting with just the year:");
        int year = scanner.nextInt();
        System.out.println("Now the month:");
        int month = scanner.nextInt() - 1;
        System.out.println("And now the day of the month:");
        int day = scanner.nextInt();
        return new GregorianCalendar(year, month, day).getTime();
    }
}