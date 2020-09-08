package io.mh.ooptest.domain.meat;

import io.mh.ooptest.enums.MeatType;
import io.mh.ooptest.enums.Rating;

public class Meat {

	private final MeatType meatType;
	private final Rating rating;
	private final int calories;

	public Meat(MeatType meatType, Rating rating, int calories) {
		this.meatType = meatType;
		this.rating = rating;
		this.calories = calories;
	}

	public MeatType getMeatType() {
		return meatType;
	}

	public Rating getRating() {
		return rating;
	}

	public int getCalories() {
		return calories;
	}

	@Override
	public String toString() {
		return "- (" + meatType +
			" with rating: " + rating +
			" which contains " + calories +
			" calories)";
	}
}
