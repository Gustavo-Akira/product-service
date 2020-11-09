package br.com.gustavoakira.microservices.repository;

import br.com.gustavoakira.microservices.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, String>{
}
