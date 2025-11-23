package dev.bozlak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        Product mushroom206 = new Product(1L,"Mushroom 400g");

        ApplicationContext context = new AnnotationConfigApplicationContext(ThisModuleAppConfig.class);
        ProductService productService = context.getBean(ProductService.class);
        productService.addProduct(mushroom206);
    }
}
