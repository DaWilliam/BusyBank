package pyramid.BusyBankSpringBoot;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepo extends MongoRepository<Customer,Integer> {
}
