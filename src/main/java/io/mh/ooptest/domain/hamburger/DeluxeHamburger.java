package io.mh.ooptest.domain.hamburger;

import io.mh.ooptest.domain.meat.Meat;
import io.mh.ooptest.enums.BreadRollType;
import io.mh.ooptest.enums.BurgerName;

public class DeluxeHamburger extends Hamburger {

	public DeluxeHamburger(BurgerName name, Meat meat, double price, BreadRollType breadRollType) {
		super(name, meat, price, breadRollType);
	}
}
