package com.adaming.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.adaming.entities.Utilisateur;
import com.adaming.repositories.UtilisateurRepository;

public class UtilisateurService implements IUtilisateurService{

	@Autowired
	UtilisateurRepository utilisateurRepository;
	

	@Override
	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public void deleteUtilisateurById(Long id) {
		utilisateurRepository.deleteById(id);		
	}

	@Override
	public Optional<Utilisateur> findUtilisateurById(Long id) {
		return utilisateurRepository.findById(id);
	}

	@Override
	public Utilisateur findUtilisateur(Long id) {
		return utilisateurRepository.findOne(id);
	}

	@Override
	public List<Utilisateur> findUtilisateurs() {
		return utilisateurRepository.findAll();
	}

}
