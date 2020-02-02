package com.SPN.model.entiteis;

public class Fedcomp {
private competitions competition;
private competition_de_federation competition_de_federation;
public Fedcomp(competitions competition, com.SPN.model.entiteis.competition_de_federation competition_de_federation) {
	super();
	this.competition = competition;
	this.competition_de_federation = competition_de_federation;
}
public Fedcomp() {
	super();
	// TODO Auto-generated constructor stub
}
public competitions getCompetition() {
	return competition;
}
public void setCompetition(competitions competition) {
	this.competition = competition;
}
public competition_de_federation getCompetition_de_federation() {
	return competition_de_federation;
}
public void setCompetition_de_federation(competition_de_federation competition_de_federation) {
	this.competition_de_federation = competition_de_federation;
}
@Override
public String toString() {
	return "Fedcomp [competition=" + competition + ", competition_de_federation=" + competition_de_federation + "]";
}

}