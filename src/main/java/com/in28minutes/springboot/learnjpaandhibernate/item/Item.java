package com.in28minutes.springboot.learnjpaandhibernate.item;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity (name = "item_details")
public class Item {

    @Id
    @Column (name = "id")
    private int id;

    @Column (name = "product_name")
    private String productName;

    @Column (name = "product_description")
    private String productDescription;

    @Column (name = "price")
    private double price;

    public Item ()
    {

    }
    public Item(int id, String productName, String productDescription, double price) {
        this.id = id;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
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
