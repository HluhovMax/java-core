package io.mh.ooptest.service.impl;

import io.mh.ooptest.constants.Constants;
import io.mh.ooptest.domain.addition.Addition;
import io.mh.ooptest.domain.hamburger.DeluxeHamburger;
import io.mh.ooptest.domain.hamburger.Hamburger;
import io.mh.ooptest.domain.hamburger.HealthyHamburger;
import io.mh.ooptest.enums.BreadRollType;
import io.mh.ooptest.enums.BurgerName;
import io.mh.ooptest.service.HamburgerService;
import java.util.List;

public class HamburgerServiceImpl implements HamburgerService {

	public Hamburger getBasicHamburger() {
		return new Hamburger(BurgerName.BASIC, Constants.SAUSAGE_MEAT, Constants.BASIC_HB_PRICE, BreadRollType.WHITE);
	}

	public void addHamburgerAddition(Hamburger hamburger, Addition addition) {
		hamburger.addAddition(addition);
	}

	public void addAllHamburgerAdditions(Hamburger hamburger, List<Addition> additions) {
		hamburger.addAllAdditions(additions);
	}

	@Override
	public HealthyHamburger getHealthyHamburger() {
		return new HealthyHamburger(Constants.VEGAN_MEAT, Constants.HEALTH_HB_PRICE);
	}

	@Override
	public DeluxeHamburger getDeluxeHamburger() {
		return new DeluxeHamburger();
	}
}
