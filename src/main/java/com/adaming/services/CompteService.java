package com.adaming.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.adaming.entities.Compte;
import com.adaming.repositories.CompteRepository;

public class CompteService implements ICompteService{

	@Autowired
	CompteRepository compteRepository;
	
	
	@Override
	public Compte saveCompte(Compte compte) {
		return compteRepository.save(compte);
	}

	@Override
	public void deleteCompteById(Long id) {
		compteRepository.deleteById(id);
	}

	@Override
	public Optional<Compte> findCompteById(Long id) {
		return compteRepository.findById(id);
	}

	@Override
	public List<Compte> findComptes() {
		return compteRepository.findAll();
	}

	@Override
	public Compte findCompte(Long id) {
		return compteRepository.findOne(id);
	}

}
