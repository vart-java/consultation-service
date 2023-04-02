package ua.vart.backend.consultationservice.entity.mapper;

import org.mapstruct.Mapper;
import ua.vart.backend.consultationservice.entity.Consultation;
import ua.vart.backend.consultationservice.entity.dto.ConsultationDto;

import java.util.List;

@Mapper
public interface ConsultationMapper {
    ConsultationDto entityToDto(Consultation consultation);
    Consultation dtoToEntity(ConsultationDto consultationDto);
    List<ConsultationDto> entitiesToDtos(Iterable<Consultation> consultations);
}
