package com.adaming.entities;

import java.util.Date;

public class CompteCourant extends Compte{

	private double decouvert;

	public CompteCourant(Long idCompte, Date dateCreation, double solde, double decouvert) {
		super(idCompte, dateCreation, solde);
		this.decouvert = decouvert;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert + "]";
	}
	
	

}
