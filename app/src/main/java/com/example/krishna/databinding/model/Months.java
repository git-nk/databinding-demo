package com.example.krishna.databinding.model;

/**
 * Created by krishna on March 23, 2017
 */

public class Months {
    private String[] name = {
            "January", "February", "March", "April", "June", "July", "August", "September",
            "October", "November", "December"
    };

    private String image = "http://gem5.com/images/%s-birthstone.png";

    public String[] getAll() {
        return name;
    }

    public String getImage(String month) {
        return String.format(image, month);
    }
}
