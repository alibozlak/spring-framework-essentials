package dev.bozlak;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public CustomerRepository getCustomerRepository(){
        return new HibernateMySqlCustomerRepository();
    }

    @Bean
    public CustomerService getCustomerService(){
        return new FirstCustomerService(getCustomerRepository());
    }
}
