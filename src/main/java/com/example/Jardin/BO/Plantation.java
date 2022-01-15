package com.example.Jardin.BO;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Plantation {

	@Id
	@GeneratedValue
	private Integer idPlantation;
	private LocalDate dtPlantation;
	private LocalDate dtRecolte;

	// Constructeur avec arguments mais sans Id
	public Plantation(LocalDate dtPlantation, LocalDate dtRecolte) {
		super();
		this.dtPlantation = dtPlantation;
		this.dtRecolte = dtRecolte;
	}

}
