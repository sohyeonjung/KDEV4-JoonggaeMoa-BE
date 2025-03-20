package org.silsagusi.joonggaemoa.domain.agent.repository;

import org.silsagusi.joonggaemoa.domain.agent.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent, Long> {
}
