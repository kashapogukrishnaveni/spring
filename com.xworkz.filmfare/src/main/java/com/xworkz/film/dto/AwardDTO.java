package com.xworkz.film.dto;

public class AwardDTO {

	private String AwardName;
	private String Spansar;
	private String Gift;
	
	public void AwardDTO() {
		System.out.println("Created \t"+this.getClass().getName());
	}

	public String getAwardName() {
		return AwardName;
	}

	public void setAwardName(String awardName) {
		AwardName = awardName;
	}

	public String getSpansar() {
		return Spansar;
	}

	public void setSpansar(String spansar) {
		Spansar = spansar;
	}

	public String getGift() {
		return Gift;
	}

	public void setGift(String gift) {
		Gift = gift;
	}

	@Override
	public String toString() {
		return "AwardDTO [AwardName=" + AwardName + ", Spansar=" + Spansar + ", Gift=" + Gift + "]";
	}
}

