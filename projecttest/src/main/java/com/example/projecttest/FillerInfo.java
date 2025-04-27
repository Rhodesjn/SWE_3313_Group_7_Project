package com.example.projecttest;
//Serena's test Java file
//contains placeholder values to read into the website
//"Endpoints.java" references these and uses an API to send these values to the JavaScript File
//JavaScript file sends these to the HTML file
public class FillerInfo {
    //Place holder values!
    private double totalBalance;
    private String userName;

    public double getBalance(){
        this.totalBalance = 100.00;
        return this.totalBalance;
    }

    public String getUserName(){
        this.userName = "Slaw Ink";
        return this.userName;
    }
}
