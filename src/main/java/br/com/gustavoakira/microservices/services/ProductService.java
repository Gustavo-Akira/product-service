package br.com.gustavoakira.microservices.services;

import br.com.gustavoakira.microservices.model.Product;

import java.util.List;

public interface ProductService {
    public Iterable<Product> getProducts();
    public Product saveProduct(Product product);
    public Product updateProduct(String id, Product product);
    public Product getProduct(String id);
    public String removeProduct(String id);
}
