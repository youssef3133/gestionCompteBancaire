package com.adaming.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Compte;
import com.adaming.entities.Utilisateur;
import com.adaming.services.CompteService;

@RestController
public class CompteController {
	
	@Autowired
	CompteService compteServ;
	
	//@PostMapping("/comptes")
	@RequestMapping(value="/comptes",method=RequestMethod.POST)
	public Compte saveOrUpdate(@RequestBody Compte utilisateur) {
		return compteServ.saveCompte(utilisateur);
	}
	
	//@DeleteMapping("/comptes/{id}")
	@RequestMapping(value="/comptes/{id}",method=RequestMethod.DELETE)
	public void deleteOneByID(@PathVariable("id") Long id) {
		compteServ.deleteCompteById(id);
	}
	
	//@GetMapping("/utilisateurs/{id}")
	@RequestMapping(value="/utilisateurs/{id}",method=RequestMethod.GET)
	public Optional<Compte> findOneById(@PathVariable("id") Long id){
		return compteServ.findCompteById(id);
	}
	
	//@GetMapping("/comptes")
	@RequestMapping(value="/comptes",method=RequestMethod.GET)
	public List<Compte> findAll(){
		return compteServ.findComptes();
	}
	
	//@PutMapping("/comptes/{id}")
	@RequestMapping(value="/comptes/{id}",method=RequestMethod.PUT)
	public Compte updateCompte(@PathVariable("id")Long id ,@RequestBody Compte compte) {
		Compte currentCompte=compteServ.findCompte(id);
		currentCompte.setDateCreation(compte.getDateCreation());
		currentCompte.setSolde(compte.getSolde());
		return compteServ.saveCompte(compte);
	}

}
