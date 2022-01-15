package com.example.Jardin.REST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Jardin.BLL.JardinManager;
import com.example.Jardin.BO.Legume;

@RestController
public class JardinWS {
	@Autowired
	private JardinManager manager;

	@GetMapping("/WS/all")
	public List<Legume> getAll() {
		return manager.getAllLegume();
	}

}
