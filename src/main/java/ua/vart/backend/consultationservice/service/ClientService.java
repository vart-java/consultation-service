package ua.vart.backend.consultationservice.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.vart.backend.consultationservice.entity.Client;
import ua.vart.backend.consultationservice.repository.ClientRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClientService {
    private final ClientRepository clientRepository;

    @Transactional
    public Client add(Client client) {
        return clientRepository.save(client);
    }

    public Client getById(Long id) {
        return clientRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public List<Client> findAllByFirstName(String firstName) {
        return clientRepository.findAllByFirstName(firstName);
    }

    @Transactional
    public Client update(Client client) {
        return clientRepository.save(client);
    }

    @Transactional
    public boolean delete(Client client) {
        clientRepository.delete(client);
        return !clientRepository.existsById(client.getId());
    }
}
