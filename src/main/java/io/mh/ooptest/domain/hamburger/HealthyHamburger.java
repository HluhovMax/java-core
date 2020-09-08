package io.mh.ooptest.domain.hamburger;

import io.mh.ooptest.domain.meat.Meat;
import io.mh.ooptest.enums.BreadRollType;
import io.mh.ooptest.enums.BurgerName;

public class HealthyHamburger extends Hamburger {

	public HealthyHamburger(Meat meat, double price) {
		super(BurgerName.HEALTHY, meat, price, BreadRollType.BROWN_RYE);
	}
}
