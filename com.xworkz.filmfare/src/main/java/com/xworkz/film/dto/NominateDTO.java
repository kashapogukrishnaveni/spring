package com.xworkz.film.dto;

import java.util.Date;

public class NominateDTO {

	private String FilmName;
	private String Language;
	private String LeadActor;
	private Date Year;
	private String SupportingLead;

	public NominateDTO() {
		System.out.println("Created \t "+this.getClass().getSimpleName());
	}

	public String getFilmName() {
		return FilmName;
	}

	public void setFilmName(String filmName) {
		FilmName = filmName;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public String getLeadActor() {
		return LeadActor;
	}

	public void setLeadActor(String leadActor) {
		LeadActor = leadActor;
	}

	public Date getYear() {
		return Year;
	}

	public void setYear(Date year) {
		Year = year;
	}

	public String getSupportingLead() {
		return SupportingLead;
	}

	public void setSupportingLead(String supportingLead) {
		SupportingLead = supportingLead;
	}

	@Override
	public String toString() {
		return "NominateDTO [FilmName=" + FilmName + ", Language=" + Language + ", LeadActor=" + LeadActor + ", Year="
				+ Year + ", SupportingLead=" + SupportingLead + "]";
	}	
}


