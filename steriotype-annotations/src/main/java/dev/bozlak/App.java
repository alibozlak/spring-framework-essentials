package dev.bozlak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(StreiotypeModuleConfig.class);
        ProductGroup tenthGroup = new ProductGroup(1, 10);
        ProductGroupService productGroupService = context.getBean(ProductGroupService.class);
        boolean result =  productGroupService.deleteProductGroupById(tenthGroup.getProductGroupId());
        if (result)
            System.out.println("Delete processing SUCCESSFUL");
        else
            System.out.println("Delete processing FAILED");
    }
}
