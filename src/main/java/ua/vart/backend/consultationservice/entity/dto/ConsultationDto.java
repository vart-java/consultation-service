package ua.vart.backend.consultationservice.entity.dto;

public record ConsultationDto(
        Long id,
        String dateOfEvent,
        PsychologistDto psychologist,
        ClientDto client,
        String notes
) {
}
