package pyramid.BusyBankSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
