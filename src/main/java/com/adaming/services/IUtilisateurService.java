package com.adaming.services;

import java.util.List;
import java.util.Optional;

import com.adaming.entities.Utilisateur;

public interface IUtilisateurService {

	//Save & Update
	public Utilisateur saveUtilisateur(Utilisateur utilisateur);
	//Delete
	public void deleteUtilisateurById(Long id);
	//Find One By Id
	public Optional<Utilisateur> findUtilisateurById(Long id);
	//Find All
	public List<Utilisateur> findUtilisateurs();
	
	public Utilisateur findUtilisateur(Long id);

}
