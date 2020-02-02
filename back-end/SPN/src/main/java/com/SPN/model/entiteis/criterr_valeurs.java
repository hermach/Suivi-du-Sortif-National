package com.SPN.model.entiteis;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

public class criterr_valeurs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String valeur;
	//relations
	@ManyToOne
	@JoinColumn(name="id_critere")
    private criteres critere;
	@ManyToOne
	@JoinColumn(name="id_journal_perform")
	private journal_performs journal_performs;
	
	public criterr_valeurs(int id, criteres critere, String valeur,
			com.SPN.model.entiteis.journal_performs journal_performs) {
		super();
		this.id = id;
		this.critere = critere;
		this.valeur = valeur;
		this.journal_performs = journal_performs;
	}
	public criterr_valeurs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public criteres getCritere() {
		return critere;
	}
	public void setCritere(criteres critere) {
		this.critere = critere;
	}
	public String getValeur() {
		return valeur;
	}
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	@JsonIgnore
	public journal_performs getJournal_performs() {
		return journal_performs;
	}
	public void setJournal_performs(journal_performs journal_performs) {
		this.journal_performs = journal_performs;
	}
	@Override
	public String toString() {
		return "criterr_valeurs [id=" + id + ", critere=" + critere + ", valeur=" + valeur + ", journal_performs="
				+ journal_performs + "]";
	}
	
	
	
}
