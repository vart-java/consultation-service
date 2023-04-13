package ua.vart.backend.consultationservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.vart.backend.consultationservice.entity.dto.PsychologistDto;
import ua.vart.backend.consultationservice.entity.mapper.PsychologistMapper;
import ua.vart.backend.consultationservice.service.PsychologistService;

@RestController
@RequestMapping("/api/v1/psychologist")
@RequiredArgsConstructor
public class PsychologistController {
    private final PsychologistService psychologistService;
    private final PsychologistMapper psychologistMapper;

    @PostMapping
    public PsychologistDto add(PsychologistDto psychologistDto) {
        return psychologistMapper.entityToDto(psychologistService.add(psychologistMapper.dtoToEntity(psychologistDto)));
    }

    @GetMapping("/{id}")
    public PsychologistDto getById(@PathVariable Long id) {
        return psychologistMapper.entityToDto(psychologistService.getById(id));
    }

    @PutMapping
    public PsychologistDto update(PsychologistDto psychologistDto) {
        return psychologistMapper.entityToDto(psychologistService.update(psychologistMapper.dtoToEntity(psychologistDto)));
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable Long id) {
        return psychologistService.delete(psychologistService.getById(id));
    }
}
