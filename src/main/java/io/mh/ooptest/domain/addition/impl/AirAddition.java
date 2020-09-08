package io.mh.ooptest.domain.addition.impl;

import io.mh.ooptest.constants.Constants;
import io.mh.ooptest.domain.addition.BaseAddition;

/**
 * Mock 'Air' addition to prevent null use
 */
public class AirAddition extends BaseAddition {

	public AirAddition() {
		super(Constants.AIR, Constants.ZERO_PRICE);
	}
}
