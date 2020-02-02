package com.SPN.model.entiteis;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class tranch_age {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int age_min; 
	private int age_max;
	private String label;
   //relations
	@OneToMany(mappedBy ="tranch_age")
	private List<journal_performs> list_journal_performs;
	public tranch_age(int id, int age_min, int age_max, List<journal_performs> list_journal_performs,String label) {
		super();
		this.id = id;
		this.age_min = age_min;
		this.age_max = age_max;
		this.list_journal_performs = list_journal_performs;
		this.label=label;
	}
	public tranch_age() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge_min() {
		return age_min;
	}
	public void setAge_min(int age_min) {
		this.age_min = age_min;
	}
	public int getAge_max() {
		return age_max;
	}
	public void setAge_max(int age_max) {
		this.age_max = age_max;
	}
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	@JsonIgnore
	public List<journal_performs> getList_journal_performs() {
		return list_journal_performs;
	}
	public void setList_journal_performs(List<journal_performs> list_journal_performs) {
		this.list_journal_performs = list_journal_performs;
	}
	@Override
	public String toString() {
		return "tranch_age [id=" + id + ", age_min=" + age_min + ", age_max=" + age_max + ", label=" + label
				+ ", list_journal_performs=" + list_journal_performs + "]";
	}
	
	

}
