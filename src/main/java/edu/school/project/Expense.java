package edu.school.project;

import java.util.Date;

public class Expense {
    // state
    private String description;
    private int amount;
    private Date date;
    private String category;

    // constructor
    public Expense(String description, int amount, Date date, String category) {
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    // setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // getters
    public String getDescription() {
        return description;
    }

    public int getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }
}
