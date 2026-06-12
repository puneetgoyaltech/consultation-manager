package com.puneet.consultationmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puneet.consultationmanager.entity.Client;
import com.puneet.consultationmanager.service.ClientService;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    // Add Client
    @PostMapping
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    // Get All Clients
    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    // Get Client By Id
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    // Update Client
    @PutMapping("/{id}")
    public Client updateClient(@PathVariable Long id,
                               @RequestBody Client client) {
        return clientService.updateClient(id, client);
    }

    // Delete Client
    @DeleteMapping("/{id}")
    public String deleteClient(@PathVariable Long id) {
        return clientService.deleteClient(id);
    }
}