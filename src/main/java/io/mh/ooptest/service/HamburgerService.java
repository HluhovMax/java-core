package io.mh.ooptest.service;

import io.mh.ooptest.domain.addition.Addition;
import io.mh.ooptest.domain.hamburger.Hamburger;
import io.mh.ooptest.domain.hamburger.HealthyHamburger;
import java.util.List;

public interface HamburgerService {

	Hamburger getBasicHamburger();

	void addHamburgerAddition(Hamburger hamburger, Addition addition);

	void addAllHamburgerAdditions(Hamburger hamburger, List<Addition> additions);

	double itemizeHamburger(Hamburger hamburger);

	HealthyHamburger getHealthyHamburger();
}
