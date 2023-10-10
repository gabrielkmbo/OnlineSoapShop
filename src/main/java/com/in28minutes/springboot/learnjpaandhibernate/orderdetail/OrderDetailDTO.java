package com.in28minutes.springboot.learnjpaandhibernate.orderdetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;

public class OrderDetailDTO {


    @JsonProperty ("item_id")
    private int itemId;

    @JsonProperty ("quantity")
    private int quantity;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
