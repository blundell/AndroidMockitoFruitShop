package com.blundell.androidmockitofruitshop.domain;


public class Auditor {

	public Auditor() {
	}

	public int count(FruitShop shop) {
		FruitBasket basket = shop.getFruit();

		int i = 0;
		for (Fruit fruit : basket) {
			i++;
		}
		return i;
	}

}
