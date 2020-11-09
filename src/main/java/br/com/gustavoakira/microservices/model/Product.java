package br.com.gustavoakira.microservices.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Objects;

@Document(indexName = "product",type = "catalog")
public class Product {
    @Id
    private String id;

    private String name;
    private Integer amount;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAmount() {
        return amount;
    }

}
