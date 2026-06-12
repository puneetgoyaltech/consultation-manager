package com.puneet.consultationmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puneet.consultationmanager.entity.Consultation;
import com.puneet.consultationmanager.repository.ConsultationRepository;

@Service
public class ConsultationService {


@Autowired
private ConsultationRepository consultationRepository;

// Add Consultation
public Consultation addConsultation(
        Consultation consultation) {

    return consultationRepository.save(consultation);
}

// Get All Consultations
public List<Consultation> getAllConsultations() {
    return consultationRepository.findAll();
}

// Get Consultation By Id
public Consultation getConsultationById(Long id) {
    return consultationRepository.findById(id).orElse(null);
}

// Update Consultation
public Consultation updateConsultation(
        Long id,
        Consultation details) {

    Consultation consultation =
            consultationRepository.findById(id)
                    .orElse(null);

    if (consultation != null) {

        consultation.setClientId(details.getClientId());
        consultation.setConsultationDate(
                details.getConsultationDate());

        consultation.setConsultationType(
                details.getConsultationType());

        consultation.setPrediction(
                details.getPrediction());

        consultation.setFees(
                details.getFees());

        consultation.setNotes(
                details.getNotes());

        return consultationRepository.save(
                consultation);
    }

    return null;
}

// Delete Consultation
public String deleteConsultation(Long id) {

    consultationRepository.deleteById(id);

    return "Consultation Deleted Successfully";
}
public List<Consultation> getConsultationsByClient(
        Long clientId) {

    return consultationRepository
            .findByClientId(clientId);
}

}
