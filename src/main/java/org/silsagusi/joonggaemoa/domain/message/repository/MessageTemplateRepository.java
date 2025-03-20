package org.silsagusi.joonggaemoa.domain.message.repository;

import org.silsagusi.joonggaemoa.domain.message.entity.MessageTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageTemplateRepository extends JpaRepository<MessageTemplate, Long> {
}
