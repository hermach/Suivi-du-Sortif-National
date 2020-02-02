package com.SPN.model.entiteis;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class athletes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private String image;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date date_de_naissance;
	@OneToMany(mappedBy ="athlete")
	private List<journal_sante> journal_sante_List;
	@OneToMany(mappedBy ="athlete")
	private List<journal_performs> journal_performs_list;
	@OneToMany(mappedBy ="athlete")
	private List<historique_entite> historique_entite_list;
	public athletes(int id, String nom, String prenom, String image, Date date_de_naissance,
			List<journal_sante> journal_sante_List, List<journal_performs> journal_performs_list,
			List<historique_entite> historique_entite_list) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.image = image;
		this.date_de_naissance = date_de_naissance;
		this.journal_sante_List = journal_sante_List;
		this.journal_performs_list = journal_performs_list;
		this.historique_entite_list = historique_entite_list;
	}
	public athletes() {
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getDate_de_naissance() {
		return date_de_naissance;
	}
	public void setDate_de_naissance(Date date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}
	public List<journal_sante> getJournal_sante_List() {
		return journal_sante_List;
	}

	public void setJournal_sante_List(List<journal_sante> journal_sante_List) {
		this.journal_sante_List = journal_sante_List;
	}
	@JsonIgnore
	public List<journal_performs> getJournal_performs_list() {
		return journal_performs_list;
	}
	public void setJournal_performs_list(List<journal_performs> journal_performs_list) {
		this.journal_performs_list = journal_performs_list;
	}
	@JsonIgnore
	public List<historique_entite> getHistorique_entite_list() {
		return historique_entite_list;
	}
	public void setHistorique_entite_list(List<historique_entite> historique_entite_list) {
		this.historique_entite_list = historique_entite_list;
	}
	@Override
	public String toString() {
		return "athletes [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", image=" + image
				+ ", date_de_naissance=" + date_de_naissance + ", journal_sante_List=" + journal_sante_List
				+ ", journal_performs_list=" + journal_performs_list + ", historique_entite_list="
				+ historique_entite_list + "]";
	}

	
	
}

