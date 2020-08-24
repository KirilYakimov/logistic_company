package nbu.project.logistic_company.repositories;

import nbu.project.logistic_company.entities.Package;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<Package,Long> {
}
