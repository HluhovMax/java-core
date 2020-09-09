package io.mh.ooptest.domain.hamburger;

import io.mh.ooptest.domain.addition.Addition;
import io.mh.ooptest.domain.meat.Meat;
import io.mh.ooptest.enums.BreadRollType;
import io.mh.ooptest.enums.BurgerName;
import java.util.ArrayList;
import java.util.List;

public class Hamburger {

	private final BurgerName name;
	private final Meat meat;
	private final double price;
	private final BreadRollType breadRollType;
	private final List<Addition> additions;

	public Hamburger(BurgerName name, Meat meat, double price, BreadRollType breadRollType) {
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadRollType = breadRollType;
		this.additions = new ArrayList<>();
	}

	public void addAddition(Addition addition) {
		if (addition != null) {
			additions.add(addition);
		}
	}

	public void addAllAdditions(List<Addition> additions) {
		if (additions != null && !additions.isEmpty()) {
			this.additions.addAll(additions);
		}
	}

	public double itemizeHamburger() {
		double hamburgerPrice = this.price;
		System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll, with " + this.meat + " meat, price is " + this.price);
		for (Addition addition : this.additions) {
			double price = addition.getPrice();
			hamburgerPrice += price;
			System.out.println("Added " + addition.getName() + " for an extra " + price);
		}

		return hamburgerPrice;
	}
}
