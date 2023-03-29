package ua.vart.backend.consultationservice.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.vart.backend.consultationservice.entity.Psychologist;
import ua.vart.backend.consultationservice.repository.PsychologistRepository;

@RequiredArgsConstructor
@Service
public class PsychologistService {
    private final PsychologistRepository psychologistRepository;

    @Transactional
    public Psychologist add(Psychologist psychologist) {
        return psychologistRepository.save(psychologist);
    }

    public Psychologist getById(Long id) {
        return psychologistRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Transactional
    public Psychologist update(Psychologist psychologist) {
        return psychologistRepository.save(psychologist);
    }

    @Transactional
    public boolean delete(Psychologist psychologist) {
        psychologistRepository.delete(psychologist);
        return !psychologistRepository.existsById(psychologist.getId());
    }
}
