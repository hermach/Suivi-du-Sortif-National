package com.SPN.model.entiteis;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class federations extends Users{

	private String nom;
	private String image;
	private String president;
	private String description;
	//relations
	@OneToMany(mappedBy ="federation")
	private List<sports> list_sports;
	@OneToMany(mappedBy ="federation")
	private List<entities_sportifs> list_entities_sportifs;
	@OneToMany(mappedBy ="federation")
	private List<competition_de_federation> list_competition_de_federation;
	public federations(String nom, String image, String president, String description, List<sports> list_sports,
			List<competition_de_federation> list_competition_de_federation,List<entities_sportifs> list_entities_sportifs) {
		super();

		this.nom = nom;
		this.image = image;
		this.president = president;
		this.description = description;
		this.list_sports = list_sports;
		this.list_competition_de_federation = list_competition_de_federation;
		this.list_entities_sportifs=list_entities_sportifs;
	}
	
	
	public federations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getPresident() {
		return president;
	}
	public void setPresident(String president) {
		this.president = president;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<sports> getList_sports() {
		return list_sports;
	}
	public void setList_sports(List<sports> list_sports) {
		this.list_sports = list_sports;
	}
	@JsonIgnore
	public List<competition_de_federation> getList_competition_de_federation() {
		return list_competition_de_federation;
	}
	public void setList_competition_de_federation(List<competition_de_federation> list_competition_de_federation) {
		this.list_competition_de_federation = list_competition_de_federation;
	}
	
	public List<entities_sportifs> getList_list_entities_sportifs() {
		return list_entities_sportifs;
	}

	@Override
	public String toString() {
		return "federations [nom=" + nom + ", image=" + image + ", president=" + president
				+ ", description=" + description + ", list_sports=" + list_sports + ", list_competition_de_federation="
				+ list_competition_de_federation + "]";
	}
	
	
	
}
