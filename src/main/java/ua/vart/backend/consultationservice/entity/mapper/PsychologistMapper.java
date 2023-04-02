package ua.vart.backend.consultationservice.entity.mapper;

import org.mapstruct.Mapper;
import ua.vart.backend.consultationservice.entity.Psychologist;
import ua.vart.backend.consultationservice.entity.dto.PsychologistDto;

import java.util.List;

@Mapper
public interface PsychologistMapper {
    PsychologistDto entityToDto(Psychologist psychologist);
    Psychologist dtoToEntity(PsychologistDto psychologistDto);
    List<PsychologistDto> entitiesToDtos(Iterable<Psychologist> psychologists);
}
