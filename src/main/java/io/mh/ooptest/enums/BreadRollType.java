package io.mh.ooptest.enums;

public enum BreadRollType {

	WHITE("White"),
	BROWN_RYE("Brown rye");

	private final String value;

	BreadRollType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
