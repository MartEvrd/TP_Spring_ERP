package com.example.tpspringerp.application;

import com.example.tpspringerp.entite.Product;

import java.util.List;

public interface IProductService {

    void create(Product p);

    List<Product> getAllProducts();

    Product getProduct(String name);

}
