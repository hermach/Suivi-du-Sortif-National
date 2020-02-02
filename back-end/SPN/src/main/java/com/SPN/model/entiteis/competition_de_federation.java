package com.SPN.model.entiteis;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class competition_de_federation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	//relations
	@ManyToOne
	@JoinColumn(name="id_federation")
	private federations federation;
	@ManyToOne
	@JoinColumn(name="id_competition")
	private competitions competition;
	public competition_de_federation(int id, federations federation, competitions competition) {
		super();
		this.id = id;
		this.federation = federation;
		this.competition = competition;
	}
	
	public competition_de_federation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public federations getFederation() {
		return federation;
	}
	public void setFederation(federations federation) {
		this.federation = federation;
	}
	public competitions getCompetition() {
		return competition;
	}
	public void setCompetition(competitions competition) {
		this.competition = competition;
	}
	@Override
	public String toString() {
		return "competition_de_federation [id=" + id + ", federation=" + federation + ", competition=" + competition
				+ "]";
	}
	


}
