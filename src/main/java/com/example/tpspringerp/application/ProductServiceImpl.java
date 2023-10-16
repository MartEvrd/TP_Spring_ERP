package com.example.tpspringerp.application;

import com.example.tpspringerp.entite.Product;
import com.example.tpspringerp.infrastructure.ProductBase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    @Override
    public void create(Product p) {
        ProductBase.addCProduct(p);
        System.out.println("----------");
        System.out.println("Envoi en bdd du produit :"+p.toString());
        System.out.println("----------");
    }

    @Override
    public List<Product> getAllProducts() {
        return ProductBase.productList;
    }

    @Override
    public Product getProduct(String name) {
        Product product = ProductBase.productList.stream()
                .filter(item -> item.getName().equals(name))
                .findFirst().orElse(null);
        return product;
    }
}
