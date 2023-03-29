package ua.vart.backend.consultationservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Consultation extends BaseEntity {

    private Timestamp dateOfEvent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "psychologist_id")
    private Psychologist psychologist;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    private String notes;
}
