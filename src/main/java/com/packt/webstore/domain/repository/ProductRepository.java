package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Product;
import java.util.List;

public interface ProductRepository {

    List <Product> getAllProducts();
    Product getProductById(String productId);
    List <Product> getProductsByCategory(String category);
}
