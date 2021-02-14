package com.example.foodpanda.Models;

public class mainmodel {
    public String name, price, discription;
    public int image;


    public mainmodel(int image, String name, String price, String discription) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.discription = discription;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
