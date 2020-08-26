package nbu.project.logistic_company.repositories;

import nbu.project.logistic_company.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
