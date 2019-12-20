package pyramid.BusyBankSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Optional<Customer> getCustomer(@PathVariable int id){
        return cs.getCustomer(id);

    }

    @RequestMapping(value = "/{id}/{name}",method = RequestMethod.PUT)
    public void updateCustomer(@PathVariable int id, @PathVariable String name){
        cs.addCustomer(cs.updateCustomer(id,name));
    }
}
