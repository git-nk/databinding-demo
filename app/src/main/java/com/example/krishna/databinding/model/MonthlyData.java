package com.example.krishna.databinding.model;

/**
 * Created by krishna on March 23, 2017
 */

public class MonthlyData {
    private String name;

    private String image = "http://gem5.com/images/%s-birthstone.png";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return String.format(image, name);
    }
}
