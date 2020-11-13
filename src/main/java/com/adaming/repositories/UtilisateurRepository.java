package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adaming.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

	Utilisateur findOne(Long id);

}
