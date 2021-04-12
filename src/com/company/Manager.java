package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Manager {
    private Material listVl[];

    public Manager(Material[] listVl) {
        this.listVl = listVl;
    }
    public double discountMeat(){
        double discountMeat = 0;
        LocalDate d = LocalDate.now();
        for (int i = 0 ; i < listVl.length ; i++) {
            if(listVl[i] instanceof Meat){
                if(listVl[i].getExpiryDate().isAfter(LocalDate.now().plusDays(5))){
                     discountMeat = listVl[i].getAmount() * 0.7;
                }
                else if(listVl[i].getExpiryDate().isAfter(LocalDate.now().plusDays(3))){
                     discountMeat = listVl[i].getAmount() * 0.5;
                }
                else  discountMeat = listVl[i].getAmount() * 0.9;
            }
        }
        return discountMeat;
    }

    public double discountCrispy(){
        double discountCrispy = 0;
        LocalDate d = LocalDate.now();
        for (int i = 0 ; i < listVl.length ; i++) {
            if(listVl[i] instanceof CrispyFlour){
                if(listVl[i].getExpiryDate().isAfter(LocalDate.now().plusMonths(4))){
                     discountCrispy = listVl[i].getAmount() * 0.8;
                }
                else if(listVl[i].getExpiryDate().isAfter(LocalDate.now().plusDays(2))){
                    discountCrispy = listVl[i].getAmount() * 0.6;
                }
                     discountCrispy = listVl[i].getAmount() * 0.95;
            }
        }
        return discountCrispy;
    }
    public double totalBeforeDiscount(){
        double sumAll = 0;
        sumAll = discountMeat() + discountCrispy();
        return  sumAll;
    }
    public double totalDiscountAll(){
        double sum1 = 0;
        double sum2 = 0;
        double sumAll = 0;
        for (int i = 0 ; i < listVl.length ; i++) {
            if(listVl[i] instanceof Meat){
                sum1 += listVl[i].getAmount();
            }else
                sum2 += listVl[i].getAmount();
        }
         sumAll = sum1 + sum2;
        return sumAll;
    }
}
