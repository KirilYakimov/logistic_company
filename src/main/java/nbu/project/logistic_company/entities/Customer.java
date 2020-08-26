package nbu.project.logistic_company.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "TBL_CUSTOMER")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "name",nullable = false)
    private String name;

    @Column (name = "address",nullable = false)
    private String address;

    @Column (name = "personalInfo",nullable = false)
    private String personalInfo;


    @ManyToOne
    @JoinColumn(name = "company_id",nullable = false)
    private Company company;

    @OneToMany (mappedBy = "customer",fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = false)
    private List<Package> packageList;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", personalInfo='" + personalInfo + '\'' +
                ", company=" + company +
                ", packageList=" + packageList +
                '}';
    }
}
