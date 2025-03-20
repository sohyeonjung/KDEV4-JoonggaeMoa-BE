package org.silsagusi.joonggaemoa.domain.property.repository;

import org.silsagusi.joonggaemoa.domain.property.entity.ScrapedProperty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScrapedPropertyRepository extends JpaRepository<ScrapedProperty, Long> {
}
