package com.example.assignment2;

public class Product {


    int price;
    int product_img;
    String brand;
    String colour;
    String connectivity_technology;
    String model_name;

    public Product(int price, int product_img, String brand, String colour, String connectivity_technology, String model_name) {
        this.price = price;
        this.product_img = product_img;
        this.brand = brand;
        this.colour = colour;

        this.connectivity_technology = connectivity_technology;
        this.model_name = model_name;
    }

    public int getPrice() {
        return price;
    }

    public int getProduct_img() {
        return product_img;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }



    public String getConnectivity_technology() {
        return connectivity_technology;
    }

    public String getModel_name() {
        return model_name;
    }
}
