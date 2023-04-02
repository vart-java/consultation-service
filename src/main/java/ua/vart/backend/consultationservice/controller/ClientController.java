package ua.vart.backend.consultationservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.vart.backend.consultationservice.entity.dto.ClientDto;
import ua.vart.backend.consultationservice.entity.mapper.ClientMapper;
import ua.vart.backend.consultationservice.service.ClientService;

import java.util.List;

@RestController("/api/v1/clients")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;
    private final ClientMapper clientMapper;

    @PostMapping
    public ClientDto add(ClientDto clientDto) {
        return clientMapper.entityToDto(clientService.add(clientMapper.dtoToEntity(clientDto)));
    }

    @GetMapping("/{id}")
    public ClientDto getById(@PathVariable Long id) {
        return clientMapper.entityToDto(clientService.getById(id));
    }

    @GetMapping("/{name}")
    public List<ClientDto> findAllByFirstName(@PathVariable String name) {
        return clientMapper.entitiesToDtos(clientService.findAllByFirstName(name));
    }

    @PutMapping
    public ClientDto update(ClientDto clientDto) {
        return clientMapper.entityToDto(clientService.update(clientMapper.dtoToEntity(clientDto)));
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable Long id) {
        return clientService.delete(clientService.getById(id));
    }
}
