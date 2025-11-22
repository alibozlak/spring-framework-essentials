package dev.bozlak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        CustomerRepository customerRepository = context.getBean("getCustomerRepository",CustomerRepository.class);

        Customer customer1 = new Customer(1, "Ali İhsan Bozlak");
//        CustomerService customerService = new FirstCustomerService(customerRepository);
//        customerService.addCustomer(customer1);
        CustomerService customerService = context.getBean("getCustomerService", CustomerService.class);
        customerService.addCustomer(customer1);
    }
}
