package nbu.project.logistic_company.repositories;

import nbu.project.logistic_company.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
