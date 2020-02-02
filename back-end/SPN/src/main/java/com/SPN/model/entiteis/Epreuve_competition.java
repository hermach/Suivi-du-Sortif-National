package com.SPN.model.entiteis;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity

public class Epreuve_competition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
//relations
	@ManyToOne
	@JoinColumn(name="id_competition")
	private competitions competition;
	@ManyToOne
	@JoinColumn(name="id_epreuve")
	private epreuve epreuve;
	public Epreuve_competition(int id, competitions competition, com.SPN.model.entiteis.epreuve epreuve) {
		super();
		this.id = id;
		this.competition = competition;
		this.epreuve = epreuve;
	}
	public Epreuve_competition() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public competitions getCompetition() {
		return competition;
	}
	public void setCompetition(competitions competition) {
		this.competition = competition;
	}
	public epreuve getEpreuve() {
		return epreuve;
	}
	public void setEpreuve(epreuve epreuve) {
		this.epreuve = epreuve;
	}
	@Override
	public String toString() {
		return "Epreuve_competition [id=" + id + ", competition=" + competition + ", epreuve=" + epreuve + "]";
	}
	
	
}
