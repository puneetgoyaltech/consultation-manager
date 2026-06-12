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

import com.puneet.consultationmanager.entity.Consultation;
import com.puneet.consultationmanager.service.ConsultationService;

@RestController
@RequestMapping("/api/consultations")
public class ConsultationController {


@Autowired
private ConsultationService consultationService;

// Add Consultation
@PostMapping
public Consultation addConsultation(
        @RequestBody Consultation consultation) {

    return consultationService
            .addConsultation(consultation);
}

// Get All Consultations
@GetMapping
public List<Consultation> getAllConsultations() {

    return consultationService
            .getAllConsultations();
}

// Get Consultation By Id
@GetMapping("/{id}")
public Consultation getConsultationById(
        @PathVariable Long id) {

    return consultationService
            .getConsultationById(id);
}

// Update Consultation
@PutMapping("/{id}")
public Consultation updateConsultation(
        @PathVariable Long id,
        @RequestBody Consultation consultation) {

    return consultationService
            .updateConsultation(
                    id,
                    consultation);
}

// Delete Consultation
@DeleteMapping("/{id}")
public String deleteConsultation(
        @PathVariable Long id) {

    return consultationService
            .deleteConsultation(id);
}
@GetMapping("/client/{clientId}")
public List<Consultation> getByClient(
        @PathVariable Long clientId) {

    return consultationService
            .getConsultationsByClient(clientId);
}

}
