package org.silsagusi.joonggaemoa.domain.consultation.repository;

import org.silsagusi.joonggaemoa.domain.consultation.entity.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
