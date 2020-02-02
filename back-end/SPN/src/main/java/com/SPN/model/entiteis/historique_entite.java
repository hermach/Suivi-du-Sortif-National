package com.SPN.model.entiteis;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class historique_entite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="id_entite_sportif")
	private entities_sportifs entite_sportif;
	@ManyToOne
	@JoinColumn(name="id_athlete")
	private athletes athlete;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date date_de_debut;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date date_de_fin;
	public historique_entite(int id, entities_sportifs entite_sportif, athletes athlete, Date date_de_debut,
			Date date_de_fin) {
		super();
		this.id = id;
		this.entite_sportif = entite_sportif;
		this.athlete = athlete;
		this.date_de_debut = date_de_debut;
		this.date_de_fin = date_de_fin;
	}
	public historique_entite(entities_sportifs entite_sportif, athletes athlete, Date date_de_debut,Date date_de_fin) {
		super();

		this.entite_sportif = entite_sportif;
		this.athlete = athlete;
		this.date_de_debut = date_de_debut;
		this.date_de_fin = date_de_fin;
	}
	public historique_entite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public entities_sportifs getEntite_sportif() {
		return entite_sportif;
	}
	public void setEntite_sportif(entities_sportifs entite_sportif) {
		this.entite_sportif = entite_sportif;
	}
	public athletes getAthlete() {
		return athlete;
	}
	public void setAthlete(athletes athlete) {
		this.athlete = athlete;
	}
	public Date getDate_de_debut() {
		return date_de_debut;
	}
	public void setDate_de_debut(Date date_de_debut) {
		this.date_de_debut = date_de_debut;
	}
	public Date getDate_de_fin() {
		return date_de_fin;
	}
	public void setDate_de_fin(Date date_de_fin) {
		this.date_de_fin = date_de_fin;
	}
	@Override
	public String toString() {
		return "historique_entite [id=" + id + ", entite_sportif=" + entite_sportif + ", athlete=" + athlete
				+ ", date_de_debut=" + date_de_debut + ", date_de_fin=" + date_de_fin + "]";
	}
	
	
	

}
