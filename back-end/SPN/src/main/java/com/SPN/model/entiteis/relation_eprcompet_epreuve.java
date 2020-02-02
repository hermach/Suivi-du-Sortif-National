package com.SPN.model.entiteis;

public class relation_eprcompet_epreuve {
	private epreuve epreuve;
	private Epreuve_competition epreuve_competition;
	public relation_eprcompet_epreuve(com.SPN.model.entiteis.epreuve epreuve, Epreuve_competition epreuve_competition) {
		super();
		this.epreuve = epreuve;
		this.epreuve_competition = epreuve_competition;
	}
	public relation_eprcompet_epreuve() {
		super();
		// TODO Auto-generated constructor stub
	}
	public epreuve getEpreuve() {
		return epreuve;
	}
	public void setEpreuve(epreuve epreuve) {
		this.epreuve = epreuve;
	}
	public Epreuve_competition getEpreuve_competition() {
		return epreuve_competition;
	}
	public void setEpreuve_competition(Epreuve_competition epreuve_competition) {
		this.epreuve_competition = epreuve_competition;
	}
	@Override
	public String toString() {
		return "relation_eprcompet_epreuve [epreuve=" + epreuve + ", epreuve_competition=" + epreuve_competition + "]";
	}
	
	

}
