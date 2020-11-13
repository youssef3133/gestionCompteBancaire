package com.adaming.services;

import java.util.List;
import java.util.Optional;

import com.adaming.entities.Compte;

public interface ICompteService {

	//Save & Update
			public Compte saveCompte(Compte compte);
			//Delete
			public void deleteCompteById(Long id);
			//Find One By Id
			public Optional<Compte> findCompteById(Long id);
			//Find All
			public List<Compte> findComptes();
			
			public Compte findCompte(Long id);
}
