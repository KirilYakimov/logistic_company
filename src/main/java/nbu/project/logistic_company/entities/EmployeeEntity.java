package nbu.project.logistic_company.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Initial implementation of a class which will represent a user
 * We are using Lombok plugin for Java in order to trim the getter setter etc.
 * logic away from the code
 *
 * For IntelliJ compile successfully Ctrl + Alt + S
 *  1. Install Lombok plugin
 *  2. Restart IDE
 *  3. Ctrl + Alt + S
 *  4. Build, Execution, Deployment | Compiler | Annotation Processors
 *  5. Make sure Enable Annotation Processing is checked
 *  6. Apply OK
 */
@Entity
@Table(name="TBL_EMPLOYEES")
@Setter
@Getter
@NoArgsConstructor
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email", nullable=false, length=200)
    private String email;

    @Column(name="password")
    private String password;

    @Override
    public String toString() {
        return "EmployeeEntity [id=" + id + ", firstName=" + firstName +
                ", lastName=" + lastName + ", email=" + email   + "]";
    }
}