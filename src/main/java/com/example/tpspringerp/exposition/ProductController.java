package com.example.tpspringerp.exposition;

import com.example.tpspringerp.application.IProductService;
import com.example.tpspringerp.entite.Product;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    IProductService serviceProduct;

    @PostMapping("/product")
    public void createProduct(@RequestBody Product p){
        serviceProduct.create(p);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return serviceProduct.getAllProducts();
    }

    @GetMapping("/product/{name}")
    public Product getProduct(@PathVariable("name") String name){
        return serviceProduct.getProduct(name);
    }
}
