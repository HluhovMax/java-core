package io.mh.ooptest.constants;

import io.mh.ooptest.domain.meat.Meat;
import io.mh.ooptest.enums.MeatType;
import io.mh.ooptest.enums.Rating;

public class Constants {
	// ADDITIONS NAMES
	public static final String CHEESE = "Cheese";
	public static final String TOMATO = "Tomato";
	public static final String LETTUCE = "Lettuce";
	public static final String CHIPS = "Chips";
	public static final String DRINKS = "Drinks";
	public static final String AIR = "Air";
	// CACHE NAMES
	public static final String PLAIN_H = "PlainHamburger";
	public static final String HEALTHY_H = "HealthyHamburger";
	public static final String DELUXE_H = "DeluxeHamburger";
	// ADDITIONS PRICES
	public static final double ZERO_PRICE = 0.0;
	public static final double TOMATO_PRICE = 0.27;
	public static final double CHEESE_PRICE = 1.12;
	public static final double LETTUCE_PRICE = 0.75;
	public static final double CHIPS_PRICE = 2.75;
	public static final double DRINKS_PRICE = 1.81;
	// BURGERS PRICES
	public static final double BASIC_HB_PRICE = 3.56;
	public static final double HEALTH_HB_PRICE = 5.67;
	public static final double DELUXE_HB_PRICE = 10.0;
	// MEAT CALORIES
	public static final int BEEF_MEAT_CALORIES = 270;
	public static final int SAUSAGE_MEAT_CALORIES = 250;
	public static final int VEGAN_MEAT_CALORIES = 120;
	// MEAT
	public static final Meat BEEF_MEAT = new Meat(MeatType.BEEF, Rating.HIGH, BEEF_MEAT_CALORIES);
	public static final Meat SAUSAGE_MEAT = new Meat(MeatType.SAUSAGE, Rating.MEDIUM, SAUSAGE_MEAT_CALORIES);
	public static final Meat VEGAN_MEAT = new Meat(MeatType.VEGAN, Rating.HIGH, VEGAN_MEAT_CALORIES);
}
