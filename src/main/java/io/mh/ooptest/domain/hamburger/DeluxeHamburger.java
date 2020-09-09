package io.mh.ooptest.domain.hamburger;

import io.mh.ooptest.constants.Constants;
import io.mh.ooptest.domain.addition.Addition;
import io.mh.ooptest.enums.BreadRollType;
import io.mh.ooptest.enums.BurgerName;
import io.mh.ooptest.service.AdditionService;
import io.mh.ooptest.service.impl.AdditionServiceImpl;
import java.util.List;

public class DeluxeHamburger extends Hamburger {

	public DeluxeHamburger() {
		super(BurgerName.DELUXE, Constants.BEEF_MEAT, Constants.DELUXE_HB_PRICE, BreadRollType.WHITE);
		AdditionService additionService = new AdditionServiceImpl();
		List<Addition> additionList = additionService.getAdditionList(additionService.deluxeHamburger());
		addAllAdditions(additionList);
	}

	@Override
	public void addAddition(Addition addition) {
		System.out.println("Cannot add additional items to a deluxe burger");
	}
}
