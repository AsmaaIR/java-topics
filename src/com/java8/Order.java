package com.java8;

import java.util.List;

public class Order {
    private Integer id;
    private List<Item> items;

    public Order() {
    }

    private String customerName;

    public Order(int id, List<Item> items, String customerName) {
        this.id = id;
        this.items = items;
        this.customerName = customerName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", items=" + items +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
