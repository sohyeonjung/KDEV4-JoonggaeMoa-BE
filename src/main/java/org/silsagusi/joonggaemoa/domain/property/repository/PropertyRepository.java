package org.silsagusi.joonggaemoa.domain.property.repository;

import org.silsagusi.joonggaemoa.domain.property.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}
