package br.com.gustavoakira.microservices.controller;

import br.com.gustavoakira.microservices.model.Product;
import br.com.gustavoakira.microservices.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/product")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveProduct(product));
    }

    @GetMapping("/product/all")
    public ResponseEntity<Iterable<Product>> getProducts(){
        return ResponseEntity.ok(service.getProducts());
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable String id){
        return ResponseEntity.ok(service.getProduct(id));
    }
}
