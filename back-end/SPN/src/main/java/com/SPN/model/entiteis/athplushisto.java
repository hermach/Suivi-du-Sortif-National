package com.SPN.model.entiteis;

public class athplushisto {
private athletes athlete;
private historique_entite historique_entite;
public athplushisto(athletes athlete, com.SPN.model.entiteis.historique_entite historique_entite) {
	super();
	this.athlete = athlete;
	this.historique_entite = historique_entite;
}
public athplushisto() {
	super();
	// TODO Auto-generated constructor stub
}
public athletes getAthlete() {
	return athlete;
}
public void setAthlete(athletes athlete) {
	this.athlete = athlete;
}
public historique_entite getHistorique_entite() {
	return historique_entite;
}
public void setHistorique_entite(historique_entite historique_entite) {
	this.historique_entite = historique_entite;
}
@Override
public String toString() {
	return "athplushisto [athlete=" + athlete + ", historique_entite=" + historique_entite + "]";
}


}
