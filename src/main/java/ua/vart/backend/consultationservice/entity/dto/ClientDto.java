package ua.vart.backend.consultationservice.entity.dto;

public record ClientDto(
        Long id,
        String firstName,
        String lastName,
        Integer phoneNumber,
        String gender,
        Integer age
) {
}
