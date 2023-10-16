package com.example.tpspringerp.infrastructure;

import com.example.tpspringerp.entite.Product;
import com.example.tpspringerp.entite.User;

import java.util.ArrayList;
import java.util.List;

public class ProductBase {

    public static List<Product> productList = new ArrayList<>();
    private static int compteur = 1;

    public static void addCProduct(Product product) {
        product.setName(product.getName()+"-"+ compteur);
        productList.add(product);
        compteur++;
    }

}
