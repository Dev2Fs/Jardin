package com.example.Jardin.BO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Legume {
	@Id
	@GeneratedValue
	private Integer idLegume;
	private String nom;
	private String type;

	// constructeur avec arguments mais sans Id
	public Legume(String nom, String type) {
		this.nom = nom;
		this.type = type;
	}

}
