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

	public BurgerName getName() {
		return name;
	}

	public Meat getMeat() {
		return meat;
	}

	public double getPrice() {
		return price;
	}

	public BreadRollType getBreadRollType() {
		return breadRollType;
	}

	public List<Addition> getAdditions() {
		return additions;
	}
}
