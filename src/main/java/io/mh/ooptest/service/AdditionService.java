package io.mh.ooptest.service;

import io.mh.ooptest.domain.addition.Addition;
import java.util.List;

public interface AdditionService {


	Addition getAdditionByName(String name);

	List<Addition> getAdditionList(String cacheName);

	String plainHamburger();

	String healthyHamburger();

	String deluxeHamburger();
}
