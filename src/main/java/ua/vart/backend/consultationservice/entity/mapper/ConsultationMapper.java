package ua.vart.backend.consultationservice.entity.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ua.vart.backend.consultationservice.entity.Consultation;
import ua.vart.backend.consultationservice.entity.dto.ConsultationDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ConsultationMapper {
    ConsultationDto entityToDto(Consultation consultation);
    @Mapping(target = "dateOfEvent", expression = "java(java.sql.Timestamp.valueOf(consultationDto.dateOfEvent()))")
    Consultation dtoToEntity(ConsultationDto consultationDto);
    List<ConsultationDto> entitiesToDtos(Iterable<Consultation> consultations);
}
