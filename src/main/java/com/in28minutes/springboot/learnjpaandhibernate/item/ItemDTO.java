package com.in28minutes.springboot.learnjpaandhibernate.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.in28minutes.springboot.learnjpaandhibernate.user.User;
import jakarta.persistence.Column;

public class ItemDTO {

    @JsonProperty ("id")
    private int id;

    @JsonProperty ("product_name")
    private String productName;

    @JsonProperty ("product_description")
    private String productDescription;

    @JsonProperty ("price")
    private double price;

    public ItemDTO(int id, String productName, String productDescription, double price) {
        this.id = id;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
    }


    public Item toItem()
    {
        return new Item(this.id, this.productName, this.productDescription, this.price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
