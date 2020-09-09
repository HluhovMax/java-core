package io.mh.ooptest.enums;

public enum BurgerName {

	BASIC("Basic"),
	DELUXE("Deluxe"),
	HEALTHY("Healthy");

	private final String value;

	BurgerName(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
