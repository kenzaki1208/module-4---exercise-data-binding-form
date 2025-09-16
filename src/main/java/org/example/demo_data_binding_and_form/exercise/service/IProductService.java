package org.example.demo_data_binding_and_form.exercise.service;

import org.example.demo_data_binding_and_form.exercise.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    void update(int id, Product product);
    void remove(int id);
}