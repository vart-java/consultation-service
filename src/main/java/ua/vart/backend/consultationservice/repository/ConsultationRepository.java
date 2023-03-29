package ua.vart.backend.consultationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.vart.backend.consultationservice.entity.Client;
import ua.vart.backend.consultationservice.entity.Consultation;
import ua.vart.backend.consultationservice.entity.Psychologist;

import java.util.List;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
    List<Consultation> findAllByPsychologist(Psychologist psychologist);
    List<Consultation> findAllByClient(Client client);
}
