package com.company;

import java.lang.reflect.Array;

public class Gifts {


    private String gifts;
    private String gender;
    private String priceRange;

    public Gifts() {
    }

    public Gifts(String gifts, String gender, String priceRange) {
        this.gifts = gifts;
        this.gender = gender;
        this.priceRange = priceRange;
    }

    public String getGifts() {
        return gifts;
    }

    public void setGifts(String gifts) {
        this.gifts = gifts;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }
}


//
//
//    public String getGifts() {
//
//        return gifts;
//    }
//
//    public Gifts(String gifts, String gender, String priceRange) {
//        this.gifts = gifts;
//        this.gender = gender;
//        this.priceRange = priceRange;
//    }
//
//    public void setGifts(String gifts) {
//        this.gifts = gifts;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String getPriceRange() {
//        return priceRange;
//    }
//
//    public void setPriceRange(String priceRange) {
//        this.priceRange = priceRange;
//    }
//}
