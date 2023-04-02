package ua.vart.backend.consultationservice.entity.dto;

public record PsychologistDto(
        Long id,
        String firstName,
        String lastName,
        Integer phoneNumber
) {
}
