package io.mh.ooptest.enums;

public enum Rating {

	LOW("Low"),
	MEDIUM("Medium"),
	HIGH("High");

	private final String value;

	Rating(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
