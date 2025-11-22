package dev.bozlak;

public class FirstCustomerService implements CustomerService{

    private final CustomerRepository customerRepository;

    public FirstCustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void addCustomer(Customer customer) {
        this.customerRepository.addCustomer(customer);
        System.out.println("With FirstCustomerService class in service layer");
    }
}
