package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GiftApp {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);



        ArrayList<Gifts >giveGift=new ArrayList<Gifts >();

        giveGift.add(new Gifts("Jewelery", "Female", "High"));
        giveGift.add(new Gifts("Weedend Getawy", "Female", "High"));
        giveGift.add(new Gifts("Wine Bottle","Female","Low"));
        giveGift.add(new Gifts("perfume","Female","high"));
        giveGift.add(new Gifts("Sweater","Female","medum"));
        giveGift.add(new Gifts("Smart Tv","Male","High"));
        giveGift.add(new Gifts("Apple Watch","Male","High"));
        giveGift.add(new Gifts("Books","Male","Low"));
        giveGift.add(new Gifts("Shoes","Male","Low"));
        giveGift.add(new Gifts("Guitar","Male","Medium"));
        giveGift.add(new Gifts("Playstation","","medum"));


        System.out.println("pleas enter your gender");
        String userInputGender=sc.nextLine();

        System.out.println("enter your price range");
        String userInputPriceRande=sc.next();



        for (Gifts gift1: giveGift){

            if (gift1.getGender().equalsIgnoreCase(userInputGender) &&
                    gift1.getPriceRange().equalsIgnoreCase(userInputPriceRande)){

                System.out.println(gift1.getGifts());

            }

        }

        }








//
//
//

//
//
//

//






	// write your code here
    }

