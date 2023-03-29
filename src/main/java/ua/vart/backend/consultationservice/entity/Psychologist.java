package ua.vart.backend.consultationservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Psychologist extends BaseEntity {

    private String firstName;

    private String lastName;

    private Integer phoneNumber;

    @OneToMany(mappedBy = "psychologist")
    private Set<Consultation> consultationSet;
}
