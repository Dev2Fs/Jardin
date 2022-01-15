package com.example.Jardin.BLL;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Jardin.BO.Legume;
import com.example.Jardin.BO.Potager;
import com.example.Jardin.DAL.LegumeDAO;
import com.example.Jardin.DAL.PotagerDAO;

@Service
public class JardinManagerImpl implements JardinManager {

//méthodes des Legume

	@Autowired
	protected LegumeDAO legumedao;

	@Override
	@Transactional

	public void addLegume(Legume legume) {
		legumedao.save(legume);

	}

	@Override
	@Transactional

	public void delLegume(Legume legume) {
		legumedao.delete(legume);
	}

	@Override
	@Transactional

	public void modLegume(Legume legume) {
		legumedao.save(legume);
	}

	@Override
	public List<Legume> getAllLegume() {
		return (List<Legume>) legumedao.findAll();
	}

//méthodes des Potager

	@Autowired
	protected PotagerDAO potagerdao;

	@Override
	@Transactional
	public void addPotager(Potager potager) {
		potagerdao.save(potager);
	}

	@Override
	@Transactional
	public void delPotager(Potager potager) {
		potagerdao.delete(potager);
	}

	@Override
	@Transactional
	public void modPotager(Potager potager) {
		potagerdao.save(potager);
	}

	@Override
	public List<Potager> getAllPotager() {
		return (List<Potager>) potagerdao.findAll();
	}

}
