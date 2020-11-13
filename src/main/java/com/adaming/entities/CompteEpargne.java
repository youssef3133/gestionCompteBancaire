package com.adaming.entities;

import java.util.Date;

public class CompteEpargne extends Compte{
	
	private double taux;

	public CompteEpargne(Long idCompte, Date dateCreation, double solde, double taux) {
		super(idCompte, dateCreation, solde);
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "CompteEpargne [taux=" + taux + "]";
	}


}
