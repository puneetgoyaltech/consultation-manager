
package com.puneet.consultationmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.puneet.consultationmanager.entity.Consultation;

public interface ConsultationRepository
        extends JpaRepository<Consultation, Long> {

    List<Consultation> findByClientId(Long clientId);
}
