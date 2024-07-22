package com.factoriaf5.ecommerceManager.products;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product saveProduct(ProductRequest productRequest){
        Product product = new Product(productRequest.name(), productRequest.description(), productRequest.price());

        return productRepo.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Optional<Product> findProduct(long id) {
        return productRepo.findById(id);
    }
}
