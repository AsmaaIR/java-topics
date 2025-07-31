package com.collection.set.treeset;

public class Product implements Comparable<Product> {

    private Integer id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product product) {
//        if(this.id > product.id)
//            return 1;
//        else if(this.id < product.id)
//            return -1;
//        return 0;
        return product.id.compareTo(this.id);
    }
}
