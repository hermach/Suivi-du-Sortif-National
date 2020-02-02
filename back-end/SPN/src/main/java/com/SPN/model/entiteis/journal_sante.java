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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class journal_sante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String poid;
	private String taille;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-dd-mm")
	private Date date_de_mesure;
	//relations
	@ManyToOne
	@JoinColumn(name="id_athlete")
	private athletes athlete;
	public journal_sante(int id, String poid, String taille, Date date_de_mesure, athletes athlete) {
		super();
		this.id = id;
		this.poid = poid;
		this.taille = taille;
		this.date_de_mesure = date_de_mesure;
		this.athlete = athlete;
	}
	public journal_sante() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPoid() {
		return poid;
	}
	public void setPoid(String poid) {
		this.poid = poid;
	}
	public String getTaille() {
		return taille;
	}
	public void setTaille(String taille) {
		this.taille = taille;
	}
	public Date getDate_de_mesure() {
		return date_de_mesure;
	}
	public void setDate_de_mesure(Date date_de_mesure) {
		this.date_de_mesure = date_de_mesure;
	}
	@JsonIgnore
	public athletes getAthlete() {
		return athlete;
	}
	public void setAthlete(athletes athlete) {
		this.athlete = athlete;
	}
	@Override
	public String toString() {
		return "journal_sante [id=" + id + ", poid=" + poid + ", taille=" + taille + ", date_de_mesure="
				+ date_de_mesure + ", athlete=" + athlete + "]";
	}
	

	
}
