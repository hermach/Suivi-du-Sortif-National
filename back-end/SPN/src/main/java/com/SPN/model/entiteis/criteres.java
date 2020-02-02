package com.SPN.model.entiteis;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class criteres {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String type_de_mesure;
	//relations
	@ManyToOne
	@JoinColumn(name="id_sport")
	private sports sport;
	@OneToMany(mappedBy ="critere")
	private List<criterr_valeurs> list_criterr_valeurs;
	public criteres(int id, String nom, String type_de_mesure, sports sport,
			List<criterr_valeurs> list_criterr_valeurs) {
		super();
		this.id = id;
		this.nom = nom;
		this.type_de_mesure = type_de_mesure;
		this.sport = sport;
		this.list_criterr_valeurs = list_criterr_valeurs;
	}
	
	public criteres() {
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
	public String getType_de_mesure() {
		return type_de_mesure;
	}
	public void setType_de_mesure(String type_de_mesure) {
		this.type_de_mesure = type_de_mesure;
	}
	public sports getSport() {
		return sport;
	}
	public void setSport(sports sport) {
		this.sport = sport;
	}
	@JsonIgnore
	public List<criterr_valeurs> getList_criterr_valeurs() {
		return list_criterr_valeurs;
	}
	public void setList_criterr_valeurs(List<criterr_valeurs> list_criterr_valeurs) {
		this.list_criterr_valeurs = list_criterr_valeurs;
	}
	@Override
	public String toString() {
		return "criteres [id=" + id + ", nom=" + nom + ", type_de_mesure=" + type_de_mesure + ", sport=" + sport
				+ ", list_criterr_valeurs=" + list_criterr_valeurs + "]";
	}
	

	
}
