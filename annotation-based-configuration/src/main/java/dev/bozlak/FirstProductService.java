package dev.bozlak;

import org.springframework.stereotype.Component;

@Component
public class FirstProductService implements ProductService {

    private final ProductRepository productRepository;

    public FirstProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void addProduct(Product product) {
        System.out.println("Processing " + product.getProductName() +
                " named product with a method in FirstProductService");
        productRepository.addProduct(product);
    }
}
