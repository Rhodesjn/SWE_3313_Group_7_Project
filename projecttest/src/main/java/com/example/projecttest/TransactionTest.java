package com.example.projecttest;

public class TransactionTest {
    private String name;
    private String date;
    private double amount;
    private String interval;

    TransactionTest(String n, String d, double a, String i){
        this.name = n;
        this.date = d;
        this.amount = a;
        this.interval = i;
    }
    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getInterval() { return interval; }
    public void setInterval(String interval) { this.interval = interval; }
}