package io.mh.ooptest.domain.addition.impl;

import io.mh.ooptest.constants.Constants;
import io.mh.ooptest.domain.addition.BaseAddition;

public class LettuceAddition extends BaseAddition {

	public LettuceAddition() {
		super(Constants.LETTUCE, Constants.LETTUCE_PRICE);
	}

}
