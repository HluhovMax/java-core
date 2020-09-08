package io.mh.ooptest.enums;

public enum MeatType {

	SAUSAGE("Sausage"),
	PORK("Pork"),
	VEGAN("Vegan"),
	BEEF("Beef");

	private final String value;

	MeatType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
