package org.silsagusi.joonggaemoa.domain.contract.repository;

import org.silsagusi.joonggaemoa.domain.contract.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}
