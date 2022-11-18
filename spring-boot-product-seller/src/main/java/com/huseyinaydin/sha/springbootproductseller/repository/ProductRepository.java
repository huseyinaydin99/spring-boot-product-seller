package com.huseyinaydin.sha.springbootproductseller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huseyinaydin.sha.springbootproductseller.model.Product;

/**
 * @author Hüseyin Aydın
 * @date 18.12.2021
 * @time 12:10
 */
public interface ProductRepository extends JpaRepository<Product, Long>
{
}
