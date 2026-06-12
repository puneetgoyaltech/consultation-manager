package com.puneet.consultationmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puneet.consultationmanager.entity.Client;
import com.puneet.consultationmanager.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    // Add Client
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    // Get All Clients
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    // Get Client By Id
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    // Update Client
    public Client updateClient(Long id, Client clientDetails) {

        Client client = clientRepository.findById(id).orElse(null);

        if (client != null) {
            client.setName(clientDetails.getName());
            client.setPhone(clientDetails.getPhone());
            client.setEmail(clientDetails.getEmail());
            client.setDateOfBirth(clientDetails.getDateOfBirth());
            client.setBirthTime(clientDetails.getBirthTime());
            client.setBirthPlace(clientDetails.getBirthPlace());

            return clientRepository.save(client);
        }

        return null;
    }

    // Delete Client
    public String deleteClient(Long id) {
        clientRepository.deleteById(id);
        return "Client Deleted Successfully";
    }
}