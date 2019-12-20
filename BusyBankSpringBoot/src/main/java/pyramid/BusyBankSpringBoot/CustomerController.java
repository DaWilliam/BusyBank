package pyramid.BusyBankSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService cs;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void saveCustomer(@RequestBody Customer customer){
        cs.addCustomer(customer);
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public void deleteCustomer(@PathVariable int id){
        cs.deleteCustomer(id);
    }
}
