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
public class sports {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	
	//relations
	@ManyToOne
	@JoinColumn(name="id_federation")
	private federations federation;
	@OneToMany(mappedBy ="sport")
	private List<entities_sportifs> list_entities_sportifs;
	@OneToMany(mappedBy ="sport")
	private List<criteres> list_criteres;
	public sports(int id, String nom, federations federation, List<entities_sportifs> list_entities_sportifs,
			List<criteres> list_criteres) {
		super();
		this.id = id;
		this.nom = nom;
		this.federation = federation;
		this.list_entities_sportifs = list_entities_sportifs;
		this.list_criteres = list_criteres;
	}
	public sports(String nom, federations federation) {
		super();
	
		this.nom = nom;
		this.federation = federation;

	}
	public sports() {
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
	@JsonIgnore
	public federations getFederation() {
		return federation;
	}
	public void setFederation(federations federation) {
		this.federation = federation;
	}
	@JsonIgnore
	public List<entities_sportifs> getList_entities_sportifs() {
		return list_entities_sportifs;
	}
	public void setList_entities_sportifs(List<entities_sportifs> list_entities_sportifs) {
		this.list_entities_sportifs = list_entities_sportifs;
	}
	@JsonIgnore
	public List<criteres> getList_criteres() {
		return list_criteres;
	}
	public void setList_criteres(List<criteres> list_criteres) {
		this.list_criteres = list_criteres;
	}
	@Override
	public String toString() {
		return "sports [id=" + id + ", nom=" + nom + ", federation=" + federation + ", list_entities_sportifs="
				+ list_entities_sportifs + ", list_criteres=" + list_criteres + "]";
	}
	

	
	
}
