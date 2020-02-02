package com.SPN.model.entiteis;

public class performence_valeurC {
	private journal_performs journal_performs;
	private criterr_valeurs criterr_valeurs;
	public performence_valeurC(com.SPN.model.entiteis.journal_performs journal_performs,
			com.SPN.model.entiteis.criterr_valeurs criterr_valeurs) {
		super();
		this.journal_performs = journal_performs;
		this.criterr_valeurs = criterr_valeurs;
	}
	public performence_valeurC() {
		super();
		// TODO Auto-generated constructor stub
	}
	public journal_performs getJournal_performs() {
		return journal_performs;
	}
	public void setJournal_performs(journal_performs journal_performs) {
		this.journal_performs = journal_performs;
	}
	public criterr_valeurs getCriterr_valeurs() {
		return criterr_valeurs;
	}
	public void setCriterr_valeurs(criterr_valeurs criterr_valeurs) {
		this.criterr_valeurs = criterr_valeurs;
	}
	@Override
	public String toString() {
		return "performence_valeurC [journal_performs=" + journal_performs + ", criterr_valeurs=" + criterr_valeurs
				+ "]";
	}
	

}
