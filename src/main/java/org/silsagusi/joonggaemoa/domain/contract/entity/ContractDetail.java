package org.silsagusi.joonggaemoa.domain.contract.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity(name = "contract_details")
@Getter
public class ContractDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "contract_detail_id")
	private Long id;

	@OneToOne
	private Contract contract;

	private LocalDate contractedAt;

	private LocalDate expiresAt;

}
