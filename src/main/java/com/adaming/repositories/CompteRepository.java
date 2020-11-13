package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long>{

	Compte findOne(Long id);

}
