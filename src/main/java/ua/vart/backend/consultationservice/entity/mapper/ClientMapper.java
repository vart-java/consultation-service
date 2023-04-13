package ua.vart.backend.consultationservice.entity.mapper;

import org.mapstruct.Mapper;
import ua.vart.backend.consultationservice.entity.Client;
import ua.vart.backend.consultationservice.entity.dto.ClientDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientDto entityToDto(Client client);
    Client dtoToEntity(ClientDto clientDto);
    List<ClientDto> entitiesToDtos(Iterable<Client> clients);
}
