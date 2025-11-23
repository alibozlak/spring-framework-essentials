package dev.bozlak;

import org.springframework.stereotype.Component;

@Component
public class JdbcMySqlProductRepository implements ProductRepository {
    @Override
    public void addProduct(Product product) {
        System.out.println("Added MySql database " + product.getProductName() + " named product with classic JDBC");
    }
}
