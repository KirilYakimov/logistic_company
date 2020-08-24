package nbu.project.logistic_company.repositories;

import nbu.project.logistic_company.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
