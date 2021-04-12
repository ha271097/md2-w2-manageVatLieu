package com.company;

import java.time.LocalDate;

public class Meat extends Material implements Discount {
    private double weight;

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double realMoney() {
        return 0;
    }

    @Override
    public double getRealMoney() {
        return getAmount();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getAmount() {
        return weight * getCost();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
