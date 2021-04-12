package com.company;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
    private double quantity;

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
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
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
