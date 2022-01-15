package com.example.Jardin.BO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Carre {

	@Id
	@GeneratedValue
	private Integer idCarre;
	private String nom;
	private Integer longueur;
	private Integer largeur;

	// contructeur avec argument mais sans id

	public Carre(String nom, Integer longueur, Integer largeur) {
		super();
		this.nom = nom;
		this.longueur = longueur;
		this.largeur = largeur;
	}

}
