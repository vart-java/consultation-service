package ua.vart.backend.consultationservice.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.vart.backend.consultationservice.entity.Client;
import ua.vart.backend.consultationservice.entity.Consultation;
import ua.vart.backend.consultationservice.entity.Psychologist;
import ua.vart.backend.consultationservice.repository.ConsultationRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ConsultationService {
    private final ConsultationRepository consultationRepository;

    @Transactional
    public Consultation add(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    public Consultation getById(Long id) {
        return consultationRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public List<Consultation> findAllByPsychologist(Psychologist psychologist) {
        return consultationRepository.findAllByPsychologist(psychologist);
    }

    public List<Consultation> findAllByClient(Client client) {
        return consultationRepository.findAllByClient(client);
    }

    @Transactional
    public Consultation update(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    @Transactional
    public boolean delete(Consultation consultation) {
        consultationRepository.delete(consultation);
        return !consultationRepository.existsById(consultation.getId());
    }
}
