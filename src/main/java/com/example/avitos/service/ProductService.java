package com.example.avitos.service;

import com.example.avitos.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();
    private long id = 0;

    {
        products.add(new Product(++id, "Playstation 5", "Simple description1",
                67000, "Moscow", "Roman"));
        products.add(new Product(++id, "Iphone 12", "Simple description2",
                88000, "SPB", "Petr"));
        products.add(new Product(++id, "TV LG", "Simple description3",
                72000, "Sochi", "Ivan"));
    }

    public List<Product> listProduct() {
        return products;
    }

    public void saveProduct(Product product) {
        product.setId(++id);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}
