package io.mh.ooptest.service.impl;

import io.mh.ooptest.constants.Constants;
import io.mh.ooptest.domain.addition.Addition;
import io.mh.ooptest.domain.hamburger.Hamburger;
import io.mh.ooptest.domain.hamburger.HealthyHamburger;
import io.mh.ooptest.domain.meat.Meat;
import io.mh.ooptest.enums.BreadRollType;
import io.mh.ooptest.enums.BurgerName;
import io.mh.ooptest.enums.MeatType;
import io.mh.ooptest.enums.Rating;
import io.mh.ooptest.service.HamburgerService;
import java.util.List;

public class HamburgerServiceImpl implements HamburgerService {

	public Hamburger getBasicHamburger() {
		return new Hamburger(BurgerName.BASIC, new Meat(MeatType.SAUSAGE, Rating.MEDIUM, 250), Constants.BASIC_HB_PRICE, BreadRollType.WHITE);
	}

	public void addHamburgerAddition(Hamburger hamburger, Addition addition) {
		hamburger.getAdditions().add(addition);
	}

	public void addAllHamburgerAdditions(Hamburger hamburger, List<Addition> additions) {
		hamburger.getAdditions().addAll(additions);
	}

	public double itemizeHamburger(Hamburger hamburger) {
		double hamburgerPrice = hamburger.getPrice();
		System.out.println(hamburger.getName() + " hamburger on a " + hamburger.getBreadRollType() + " roll, with " + hamburger.getMeat() + " meat, price is " + hamburger.getPrice());
		for (Addition addition : hamburger.getAdditions()) {
			double price = addition.getPrice();
			hamburgerPrice += price;
			System.out.println("Added " + addition.getName() + " for an extra " + price);
		}

		return hamburgerPrice;
	}

	@Override
	public HealthyHamburger getHealthyHamburger() {
		return new HealthyHamburger(new Meat(MeatType.VEGAN, Rating.HIGH, 120), Constants.HEALTH_HB_PRICE);
	}
}
