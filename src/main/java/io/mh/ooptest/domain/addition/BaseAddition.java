package io.mh.ooptest.domain.addition;

public class BaseAddition implements Addition {

	private final String name;
	private final double price;

	public BaseAddition(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
