package com.sapient.assement.football.enums;

public enum MatchStatus {

	YET_TO_START("YET_TO_START"),
	
	IN_PROGRESS("IN_PROGRESS"),
	
	COMPLETED("COMPLETED");

	private String code;

	private MatchStatus(String code) {
		this.code = code;
	}
	
	public String code() {
		return this.code;
	}
}
