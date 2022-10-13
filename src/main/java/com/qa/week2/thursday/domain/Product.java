package com.qa.week2.thursday.domain;

import java.util.Objects;

public class Product {
    private long id;
    private String name;
    private double costPrice;
    private double retailPrice;

    public Product(String name, double costPrice, double retailPrice) {
        this(0,name,costPrice,retailPrice);
    }

    public Product(long id, String name, double costPrice, double retailPrice) {
        setId(id);
        setName(name);
        setCostPrice(costPrice);
        setRetailPrice(retailPrice);
    }

    public Product() {
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Product && ((Product)obj).id == id;
    }

    @Override
    public int hashCode() {
        return (int)id;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %n",name,retailPrice);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        if(retailPrice < 0){
            throw new IllegalArgumentException("RetailPrice can't be negative");
        }
        this.retailPrice = retailPrice;
    }
}
