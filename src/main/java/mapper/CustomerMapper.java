package mapper;

import bean.Customer;
import java.util.List;

public interface CustomerMapper {
    int insertCustomer();
    void deleteCustomer();
    List<Customer> getAllCustomer();
    Customer getCustomerById();
    void updateCustomer();
}
