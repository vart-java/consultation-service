package ua.vart.backend.consultationservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Client extends BaseEntity {

    private String firstName;

    private String lastName;

    private Integer phoneNumber;

    private String gender;

    private Integer age;

    @OneToMany(mappedBy = "client")
    private Set<Consultation> consultationSet;
}
