package com.bhavdip.SpringWebApp.service;

import com.bhavdip.SpringWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public void updateProduct(Product product,int prodId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                products.set(i, product); // Update product in place
                return; // Exit early once found
            }
        }
    }

    public void deleteProduct(int prodId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                products.remove(i); // Update product in place
                return; // Exit early once found
            }
        }
    }
}
