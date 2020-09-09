package io.mh.ooptest.service.impl;

import io.mh.ooptest.constants.Constants;
import io.mh.ooptest.domain.addition.Addition;
import io.mh.ooptest.domain.addition.impl.AirAddition;
import io.mh.ooptest.domain.addition.impl.CheeseAddition;
import io.mh.ooptest.domain.addition.impl.ChipsAddition;
import io.mh.ooptest.domain.addition.impl.DrinksAddition;
import io.mh.ooptest.domain.addition.impl.LettuceAddition;
import io.mh.ooptest.domain.addition.impl.TomatoAddition;
import io.mh.ooptest.service.AdditionService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AdditionServiceImpl implements AdditionService {

	private final Map<String, Map<String, Addition>> map;

	public AdditionServiceImpl() {
		// FOR PLAIN
		Map<String, Addition> additionForHamburgerCache = new HashMap<>();
		additionForHamburgerCache.put(Constants.CHEESE, new CheeseAddition());
		additionForHamburgerCache.put(Constants.TOMATO, new TomatoAddition());
		additionForHamburgerCache.put(Constants.LETTUCE, new LettuceAddition());
		// FOR HEALTHY
		Map<String, Addition> additionForHealthyHamburgerCache = new HashMap<>();
		// FOR DELUXE
		Map<String, Addition> additionForDeluxeHamburgerCache = new HashMap<>();
		additionForDeluxeHamburgerCache.put(Constants.CHIPS, new ChipsAddition());
		additionForDeluxeHamburgerCache.put(Constants.DRINKS, new DrinksAddition());

		this.map = new HashMap<>();
		this.map.put(Constants.PLAIN_H, additionForHamburgerCache);
		this.map.put(Constants.HEALTHY_H, additionForHealthyHamburgerCache);
		this.map.put(Constants.DELUXE_H, additionForDeluxeHamburgerCache);
	}

	public Addition getAdditionByName(String name) {
		Set<Addition> uniqueValues = map.values().stream().flatMap(map -> map.values().stream()).collect(Collectors.toSet());
		return uniqueValues.stream().filter(addition -> addition.getName().equals(name)).findFirst().orElse(new AirAddition());
	}

	public List<Addition> getAdditionList(String cacheName) {
		return new ArrayList<>(map.get(cacheName).values());
	}

	@Override
	public String plainHamburger() {
		return Constants.PLAIN_H;
	}

	@Override
	public String healthyHamburger() {
		return Constants.HEALTHY_H;
	}

	@Override
	public String deluxeHamburger() {
		return Constants.DELUXE_H;
	}
}
