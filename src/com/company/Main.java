package com.company;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Material listVL [] = new Material[10];
//        String id, String name, LocalDate manufacturingDate, int cost, double quantity
        listVL[0] = new CrispyFlour("id1", "sp1", LocalDate.of(2020, Month.JANUARY, 12),10000, 100 );
        listVL[1] = new CrispyFlour("id2", "sp2", LocalDate.of(2020, Month.AUGUST, 12),10000, 100 );
        listVL[2] = new CrispyFlour("id3", "sp3", LocalDate.of(2020, Month.DECEMBER, 12),10000, 100 );
        listVL[3] = new CrispyFlour("id4", "sp4", LocalDate.of(2020, Month.MAY, 12),10000, 100 );
        listVL[4] = new CrispyFlour("id5", "sp5", LocalDate.of(2021, Month.APRIL, 12),10000, 100 );
//        String id, String name, LocalDate manufacturingDate, int cost, double weight
        listVL[5] = new Meat("id3", "sp3", LocalDate.of(2021, Month.APRIL, 12),300000, 150 );
        listVL[6] = new Meat("id4", "sp4",LocalDate.of(2021, Month.APRIL, 11),150000, 150 );
        listVL[7] = new Meat("id4", "sp4",LocalDate.of(2021, Month.APRIL, 10),200000, 150 );
        listVL[8] = new Meat("id4", "sp4",LocalDate.of(2021, Month.APRIL, 9),180000, 150 );
        listVL[9] = new Meat("id4", "sp4",LocalDate.of(2021, Month.APRIL, 6),200000, 150 );
        Manager haanh = new Manager(listVL);

        double sumMeat = 0;
        double sumCrispyFlour = 0;
        for (Material a : listVL
             ) {
            if(a instanceof Meat){
                sumMeat += haanh.discountMeat();
            }else sumCrispyFlour += haanh.discountCrispy();
        }
        System.out.println("Price Meat Sale = " + sumMeat);
        System.out.println("Price CrispyFlour Sale = " + sumCrispyFlour);
        System.out.println("Money Discount = " + (haanh.totalDiscountAll() - haanh.totalBeforeDiscount()));
    }
}
