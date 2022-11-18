package com.huseyinaydin.sha.springbootproductseller.service;

import java.util.List;

import com.huseyinaydin.sha.springbootproductseller.model.Product;

/**
 * @author Hüseyin Aydın
 * @date 18.12.2021
 * @time 12:31
 */
public interface ProductService
{
    Product saveProduct(Product product);

    void deleteProduct(Long id);

    List<Product> findAllProducts();
}
