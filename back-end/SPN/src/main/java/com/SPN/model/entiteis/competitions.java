package com.SPN.model.entiteis;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class competitions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String lieu_de_competition;
	private String type;
	@OneToMany(mappedBy ="competition")
	private List<competition_de_federation> list_competition_de_federation;
	@OneToMany(mappedBy ="competition")
	private List<Epreuve_competition> list_epreuve_competition;
	public competitions(int id, String nom, String lieu_de_competition, String type,
			List<competition_de_federation> list_competition_de_federation,
			List<Epreuve_competition> list_epreuve_competition) {
		super();
		this.id = id;
		this.nom = nom;
		this.lieu_de_competition = lieu_de_competition;
		this.type = type;
		this.list_competition_de_federation = list_competition_de_federation;
		this.list_epreuve_competition = list_epreuve_competition;
	}
	public competitions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLieu_de_competition() {
		return lieu_de_competition;
	}
	public void setLieu_de_competition(String lieu_de_competition) {
		this.lieu_de_competition = lieu_de_competition;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@JsonIgnore
	public List<competition_de_federation> getList_competition_de_federation() {
		return list_competition_de_federation;
	}
	public void setList_competition_de_federation(List<competition_de_federation> list_competition_de_federation) {
		this.list_competition_de_federation = list_competition_de_federation;
	}
	@JsonIgnore
	public List<Epreuve_competition> getList_epreuve_competition() {
		return list_epreuve_competition;
	}
	public void setList_epreuve_competition(List<Epreuve_competition> list_epreuve_competition) {
		this.list_epreuve_competition = list_epreuve_competition;
	}
	@Override
	public String toString() {
		return "competitions [id=" + id + ", nom=" + nom + ", lieu_de_competition=" + lieu_de_competition + ", type="
				+ type + ", list_competition_de_federation=" + list_competition_de_federation
				+ ", list_epreuve_competition=" + list_epreuve_competition + "]";
	}

}
