package com.puneet.consultationmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.puneet.consultationmanager.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}