package br.com.gustavoakira.microservices.services;

import br.com.gustavoakira.microservices.model.Product;
import br.com.gustavoakira.microservices.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository repository;

    @Override
    public Iterable<Product> getProducts() {
        return repository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Product updateProduct(String id, Product product) {
        Product old = getProduct(id);
        old.setName(product.getName());
        old.setAmount(product.getAmount());
        return repository.save(old);
    }

    @Override
    public Product getProduct(String id) {
        Optional<Product> optional = repository.findById(id);
        optional.orElseThrow(()->new ResolutionException(id.toString()));
        return optional.get();
    }

    @Override
    public String removeProduct(String id) {
        Product toRemove = getProduct(id);
        repository.delete(toRemove);
        return "ok";
    }
}
