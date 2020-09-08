package io.mh.ooptest;

import io.mh.ooptest.domain.hamburger.Hamburger;
import io.mh.ooptest.domain.hamburger.HealthyHamburger;
import io.mh.ooptest.service.AdditionService;
import io.mh.ooptest.service.HamburgerService;
import io.mh.ooptest.service.impl.AdditionServiceImpl;
import io.mh.ooptest.service.impl.HamburgerServiceImpl;

public class BurgerRunner {
	public static void main(String[] args) {
		HamburgerService hamburgerService = new HamburgerServiceImpl();
		AdditionService additionService = new AdditionServiceImpl();

		// PLAIN HAMBURGER CASE
		Hamburger hamburger = hamburgerService.getBasicHamburger();
		hamburgerService.addAllHamburgerAdditions(hamburger, additionService.getAdditionList(additionService.plainHamburger()));
		double plainHBPrice = hamburgerService.itemizeHamburger(hamburger);
		System.out.println("Total price for plain hamburger: " + (float) plainHBPrice);


		// HEALTHY HAMBURGER CASE
		HealthyHamburger healthyHamburger = hamburgerService.getHealthyHamburger();
		hamburgerService.addAllHamburgerAdditions(healthyHamburger, additionService.getAdditionList(additionService.healthyHamburger()));
		double healthyHBPrice = hamburgerService.itemizeHamburger(healthyHamburger);
		System.out.println("Total price for healthy hamburger: " + (float) healthyHBPrice);

		// DELUXE HAMBURGER CASE


	}
}
