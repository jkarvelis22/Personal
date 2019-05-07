package com.joshua.model;

public class Content {
    private int amount;
    private String description;

    //constructors
    public Content(int amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    //getters and setters
    public int getAmount(){
        return amount;
    }
    public void setAmount(){
        this.amount = amount;
    }

    public String getDescription(){
        return description;
    }
    public void  setDescription(){
        this.description=description;
    }
    //override toString()


    @Override
    public String toString() {
        return "Content{" +
                "amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}