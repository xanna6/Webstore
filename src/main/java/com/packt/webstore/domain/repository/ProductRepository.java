package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Product;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ProductRepository {

    List <Product> getAllProducts();
    Product getProductById(String productId);
    List <Product> getProductsByCategory(String category);
    Set<Product> getProductsByFilter (Map<String, List<String>> filterParams);
    List <Product> filterProducts(String category, Map<String, List<String>> priceParams, String manufacturer);
}
