package com.bhavdip.SpringWebApp.service;

import com.bhavdip.SpringWebApp.model.Product;
import com.bhavdip.SpringWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
    //Arrays.asList  make it immutable
//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"Shampoo",20),new Product(102,"Soap",30))) ;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product(999,"dummy",100));
    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product,int prodId) {
        repo.save(product); // update if exist other wise create
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
