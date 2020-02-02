package com.SPN.model.entiteis;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class epreuve {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String label;
	//relations
	@OneToMany(mappedBy ="epreuve")
	private List<Epreuve_competition> list_epreuve_competition;
	public epreuve(int id, String label, List<Epreuve_competition> list_epreuve) {
		super();
		this.id = id;
		this.label = label;
		this.list_epreuve_competition = list_epreuve;
	}
	public epreuve() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	@JsonIgnore
	public List<Epreuve_competition> getList_epreuve() {
		return list_epreuve_competition;
	}
	public void setList_epreuve(List<Epreuve_competition> list_epreuve) {
		this.list_epreuve_competition = list_epreuve;
	}
	@Override
	public String toString() {
		return "epreuve [id=" + id + ", label=" + label + ", list_epreuve=" + list_epreuve_competition + "]";
	}
	

	
}
