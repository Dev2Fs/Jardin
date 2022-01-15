package com.example.Jardin.BLL;

import java.util.List;

import com.example.Jardin.BO.Legume;
import com.example.Jardin.BO.Potager;

public interface JardinManager {

	// méthodes (fonctionnalités) pour les légumes
	// CRUD
	public void addLegume(Legume legume);

	public void delLegume(Legume legume);

	public void modLegume(Legume legume);

	public List<Legume> getAllLegume();

	// méthodes (fonctionnalités) pour les potagers

	public void addPotager(Potager potager);

	public void delPotager(Potager potager);

	public void modPotager(Potager potager);

	public List<Potager> getAllPotager();

}
