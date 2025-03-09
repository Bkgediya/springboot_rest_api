package com.bhavdip.SpringWebApp.service;

import com.bhavdip.SpringWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    //Arrays.asList  make it immutable
    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"Shampoo",20),new Product(102,"Soap",30))) ;

    public List<Product> getProducts() {
        return this.products;
    }

    public Product getProductById(int prodId) {
        return products.stream().filter(s -> s.getProdId() == prodId).findFirst().orElse(new Product(105,"Biscuit",10));
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
}
