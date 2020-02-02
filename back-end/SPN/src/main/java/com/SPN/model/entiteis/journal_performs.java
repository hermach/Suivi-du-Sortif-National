package com.SPN.model.entiteis;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class journal_performs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-dd-mm")
	private Date date_competition;
	
	//relations
	@ManyToOne
	@JoinColumn(name="id_athlete")
	private athletes athlete;
//	@ManyToOne
//	@JoinColumn(name="id_sport")
//	private sports sport;
	@ManyToOne
	@JoinColumn(name="id_coompetition")
	private competitions competition;
	@OneToMany(mappedBy ="journal_performs")
	private List<criterr_valeurs> list_valeur_critere;
	@ManyToOne
	@JoinColumn(name="id_tranch_age")
	private tranch_age tranch_age;
	@ManyToOne
	@JoinColumn(name="id_epreuv")
	private epreuve epreuve;
	
	public journal_performs(int id, Date date_competition, athletes athlete, competitions competition,
			List<criterr_valeurs> list_valeur_critere, com.SPN.model.entiteis.tranch_age tranch_age,
			com.SPN.model.entiteis.epreuve epreuve) {
		super();
		this.id = id;
		this.date_competition = date_competition;
		this.athlete = athlete;
		this.competition = competition;
		this.list_valeur_critere = list_valeur_critere;
		this.tranch_age = tranch_age;
		this.epreuve = epreuve;
	}

	public journal_performs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate_competition() {
		return date_competition;
	}
	public void setDate_competition(Date date_competition) {
		this.date_competition = date_competition;
	}
	public athletes getAthlete() {
		return athlete;
	}
	public void setAthlete(athletes athlete) {
		this.athlete = athlete;
	}
	public competitions getCompetition() {
		return competition;
	}
	public void setCompetition(competitions competition) {
		this.competition = competition;
	}

	public List<criterr_valeurs> getList_valeur_critere() {
		return list_valeur_critere;
	}
	public void setList_valeur_critere(List<criterr_valeurs> list_valeur_critere) {
		this.list_valeur_critere = list_valeur_critere;
	}
	public tranch_age getTranch_age() {
		return tranch_age;
	}
	public void setTranch_age(tranch_age tranch_age) {
		this.tranch_age = tranch_age;
	}
	
	public epreuve getEpreuve() {
		return epreuve;
	}

	public void setEpreuve(epreuve epreuve) {
		this.epreuve = epreuve;
	}

	@Override
	public String toString() {
		return "journal_performs [id=" + id + ", date_competition=" + date_competition + ", athlete=" + athlete
				+ ", competition=" + competition + ", list_valeur_critere=" + list_valeur_critere + ", tranch_age="
				+ tranch_age + ", epreuve=" + epreuve + "]";
	}




}
