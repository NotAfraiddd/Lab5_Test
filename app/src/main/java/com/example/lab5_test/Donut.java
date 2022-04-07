package com.example.lab5_test;

import java.io.Serializable;

public class Donut implements Serializable {
    private int imgURL;
    private String title;
    private String description;
    private String money;

    public Donut(int imgURL, String title, String description, String money) {
        this.imgURL = imgURL;
        this.title = title;
        this.description = description;
        this.money = money;
    }

    public int getImgURL() {
        return imgURL;
    }

    public void setImgURL(int imgURL) {
        this.imgURL = imgURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
