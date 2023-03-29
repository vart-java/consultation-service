package ua.vart.backend.consultationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.vart.backend.consultationservice.entity.Psychologist;

@Repository
public interface PsychologistRepository extends JpaRepository<Psychologist, Long> {
}
