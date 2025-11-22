package dev.bozlak;

public class HibernateMySqlCustomerRepository implements CustomerRepository{
    @Override
    public void addCustomer(Customer customer) {
        System.out.println("Added " + customer.getCustomerName() + " named customer to MySql Database with Hibernate");
    }
}
