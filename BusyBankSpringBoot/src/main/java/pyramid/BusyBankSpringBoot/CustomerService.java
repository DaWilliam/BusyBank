package pyramid.BusyBankSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo cr;

    public void addCustomer(Customer c){
        cr.save(c);
    }

    public void deleteCustomer(int id){
        cr.deleteById(id);
    }

    public Optional<Customer> getCustomer(@PathVariable int  id){
        return cr.findById(id);

    }


    public Customer updateCustomer(@PathVariable int  id, @PathVariable String name){
        Optional<Customer> cus = cr.findById(id);
        Customer customer;
        customer = cus.get();

        customer.setName(name);

        return customer;
    }
}
