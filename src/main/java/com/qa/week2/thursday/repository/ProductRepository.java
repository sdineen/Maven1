package com.qa.week2.thursday.repository;

import java.util.List;

import com.qa.week2.thursday.domain.Product;

public interface ProductRepository {
    long create(Product product);

    List<Product> selectAll();

    Product findById(long id);

    List<Product> findByNameContaining(String partOfName);

    List<Product> findByRetailPriceLessThanEqual(double max);

    boolean update(Product product);

    boolean deleteById(Long id);
}
