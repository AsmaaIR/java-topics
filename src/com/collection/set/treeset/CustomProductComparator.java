package com.collection.set.treeset;

import java.util.Comparator;

public class CustomProductComparator implements Comparator<Product>{

    @Override
    public int compare(Product currentProduct, Product newProduct) {
        if(currentProduct.getId() > newProduct.getId())
            return -1;
        else if(currentProduct.getId() < newProduct.getId())
            return 1;
        return 0;
//        return newProduct.getName().compareTo(currentProduct.getName());
    }
}
