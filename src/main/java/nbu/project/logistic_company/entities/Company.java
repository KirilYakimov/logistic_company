package nbu.project.logistic_company.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TBL_COMPANY")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "company",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL, orphanRemoval = false)
    private List<Office> officeList;

    @OneToMany(mappedBy = "company",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = false)
    private List<Customer> customerList;

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", officeList=" + officeList +
                ", customerList=" + customerList +
                '}';
    }

}
