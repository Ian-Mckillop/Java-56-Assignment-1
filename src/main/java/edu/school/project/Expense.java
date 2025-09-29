package edu.school.project;

public class Expense {
    // state
    String description;
    int amount;
    int date;
    String category;

    // constructors

    public Expense(String description, int amount, int date, String category) {
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    // setters

    void setDescription(String description) {
        this.description = description;
    }

    void setAmount(int amount) {
        this.amount = amount;
    }

    void setDate(int date) {
        this.date = date;
    }

    void setCategory(String category) {
        this.category = category;
    }

    // getters

    String getDescription() {
        return description;
    }

    int getAmount() {
        return amount;
    }

    int getDate() {
        return date;
    }

    String getCategory() {
        return category;
    }
}
