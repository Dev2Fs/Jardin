package com.example.Jardin.BO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Potager {
	@Id
	@GeneratedValue
	private Integer idPotager;
	private String nom;
	private String localisation;
	private Integer longueur;
	private Integer largeur;

	// constructeur avec arguments mais sans id

	public Potager(String nom, String localisation, Integer longueur, Integer largeur) {
		super();
		this.nom = nom;
		this.localisation = localisation;
		this.longueur = longueur;
		this.largeur = largeur;
	}

}
