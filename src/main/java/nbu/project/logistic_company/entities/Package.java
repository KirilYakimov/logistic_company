package nbu.project.logistic_company.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nbu.project.logistic_company.enumerable.PackageState;

import javax.persistence.*;

@Entity
@Table(name = "TBL_PACKAGE")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Package {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "name",nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column (name = "packageState",nullable = false)
    private PackageState state;

    @Column (name = "recipientName", nullable = false)
    private String recipientName;

    @Column (name ="recipientInfo",nullable = false)
    private String recipientInfo;

    @Column (name = "recipientAddress")
    private String recipientAddress;

    @Column (name ="weight")
    private double packageWeight;


    @ManyToOne
    @JoinColumn (name = "customer_id",nullable = false)
     private Customer customer;

    @Override
    public String toString() {
        return "Package{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state=" + state +
                ", recipientName='" + recipientName + '\'' +
                ", recipientInfo='" + recipientInfo + '\'' +
                ", recipientAddress='" + recipientAddress + '\'' +
                ", packageWeight=" + packageWeight +
                '}';
    }
}
