package com.bhavdip.SpringWebApp.controller;

import com.bhavdip.SpringWebApp.model.Product;
import com.bhavdip.SpringWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts () {
        return this.productService.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById (@PathVariable int prodId) {
           return this.productService.getProductById(prodId);
    }

    @PostMapping("/product")
    public void addProduct (@RequestBody Product product) {
         this.productService.addProduct(product);
    }

    @PutMapping("/product/{prodId}")
    public void updateProduct (@RequestBody Product product, @PathVariable int prodId) {
        this.productService.updateProduct(product,prodId);
    }

    @DeleteMapping("/product/{prodId}")
    public void deleteProduct (@PathVariable int prodId) {
        this.productService.deleteProduct(prodId);
    }

}
