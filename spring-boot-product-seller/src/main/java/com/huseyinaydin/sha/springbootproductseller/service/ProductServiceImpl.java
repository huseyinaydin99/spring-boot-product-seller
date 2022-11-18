package com.huseyinaydin.sha.springbootproductseller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huseyinaydin.sha.springbootproductseller.model.Product;
import com.huseyinaydin.sha.springbootproductseller.repository.ProductRepository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Hüseyin Aydın
 * @date 18.12.2021
 * @time 12:31
 */
@Service
public class ProductServiceImpl implements ProductService
{
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product)
    {
        product.setCreateTime(LocalDateTime.now());

        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id)
    {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findAllProducts()
    {
        return productRepository.findAll();
    }
}
