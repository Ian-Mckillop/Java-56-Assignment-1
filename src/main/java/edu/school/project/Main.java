package edu.school.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean closeProgram = false;
        ExpenseManager expenseTracker = new ExpenseManager();
        System.out.println("Hello and welcome to this Expense Tracker!");
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("Would you like to:");
        System.out.println("1. Add a new expense?");
        System.out.println("2. Look at your current expenses?");
        System.out.println("3. Exit the Expense Tracker?");
        int option = scanner.nextInt();

        switch(option) {
            case 1:
                System.out.println("To enter a new expense, please add a description:");
                String description = scanner.next();
                System.out.println("Please add an amount:");
                int amount = scanner.nextInt();
                System.out.println("Please add a date:");
                int date = scanner.nextInt();
                System.out.println("Please add a category:");
                String category = scanner.next();
                expenseTracker.expenseAdd(description, amount, date, category);
                System.out.println("Expense Added! \n");
                break;
            case 2:
                System.out.println("Outputting all expenses!");
                expenseTracker.listExpenses();
                break;
            case 3:
                closeProgram = true;
        }
        } while(!closeProgram);
    }
}