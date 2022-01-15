package com.example.Jardin;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Jardin.BLL.JardinManager;
import com.example.Jardin.BO.Potager;

@SpringBootApplication
public class JardinApplication implements CommandLineRunner {

	@Autowired
	JardinManager manager;

	public static void main(String[] args) {
		SpringApplication.run(JardinApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		// Essais utilisation du CRUD Legume

		// Méthode rapide pour créer objets

//		manager.addLegume(new Legume("carotte", "racine"));
//		manager.addLegume(new Legume("brocoli", "crucifère"));
//		manager.addLegume(new Legume("navet", "racine"));
//		manager.addLegume(new Legume("potimaron", "cucurbitacé"));
//		manager.addLegume(new Legume("choux de bruxelle", "crucifère"));

		// Méthode complète pour créer objets (nécessaire pour delete?)
//		Legume chouxRouge = new Legume("Choux rouge", "crucifère");
//		manager.addLegume(chouxRouge);

//		Legume chouxVert = new Legume("chouxVert", "crucifere");
//		manager.addLegume(chouxVert);
//		System.out.println(manager.getAllLegume());
//		chouxVert.setNom("JeNeSuisPasUnChoux");
//		manager.modLegume(chouxVert);
//		System.out.println(manager.getAllLegume());
//		manager.delLegume(chouxVert);
//		System.out.println(manager.getAllLegume());

		// Essais utilisation du CRUD Potager

		// Méthode rapide pour créer objets ne marche pas: null pointeur

//		manager.addPotager(new Potager("le coin des choux", "l'endroit innaccessible", 30, 20));
//		manager.addPotager(new Potager("le coin des racines", "la jolie terre", 20, 20));
//		manager.addPotager(new Potager("le coin des salades", "en plein milieu", 5, 2));
//		manager.addPotager(new Potager("le coin des fruits", "en plein soleil", 50, 20));

		// Méthode complète pour créer objets

		Potager leCoinDesChoux = new Potager("le coin des choux", "l'endroit innaccessible", 30, 20);
		manager.addPotager(leCoinDesChoux);

	}

}
