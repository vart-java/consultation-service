package ua.vart.backend.consultationservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.vart.backend.consultationservice.entity.dto.ConsultationDto;
import ua.vart.backend.consultationservice.entity.mapper.ConsultationMapper;
import ua.vart.backend.consultationservice.service.ClientService;
import ua.vart.backend.consultationservice.service.ConsultationService;
import ua.vart.backend.consultationservice.service.PsychologistService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/consultations")
@RequiredArgsConstructor
public class ConsultationController {
    private final ConsultationService consultationService;
    private final ConsultationMapper consultationMapper;
    private final ClientService clientService;
    private final PsychologistService psychologistService;

    @PostMapping
    public ConsultationDto add(ConsultationDto consultationDto) {
        return consultationMapper.entityToDto(consultationService.add(consultationMapper.dtoToEntity(consultationDto)));
    }

    @GetMapping("/{id}")
    public ConsultationDto getById(@PathVariable Long id) {
        return consultationMapper.entityToDto(consultationService.getById(id));
    }

    @GetMapping("/{clientId}")
    public List<ConsultationDto> findAllByClient(@PathVariable Long clientId) {
        return consultationMapper.entitiesToDtos(consultationService.findAllByClient(clientService.getById(clientId)));
    }

    @GetMapping("/{psychologistId}")
    public List<ConsultationDto> findAllByPsychologist(@PathVariable Long psychologistId) {
        return consultationMapper.entitiesToDtos(consultationService.findAllByPsychologist(psychologistService.getById(psychologistId)));
    }

    @PutMapping
    public ConsultationDto update(ConsultationDto consultationDto) {
        return consultationMapper.entityToDto(consultationService.update(consultationMapper.dtoToEntity(consultationDto)));
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable Long id) {
        return consultationService.delete(consultationService.getById(id));
    }
}
