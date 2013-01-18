package com.blundell.androidmockitofruitshop;

import static org.junit.Assert.assertEquals;

import com.blundell.androidmockitofruitshop.domain.*;

import org.junit.Test;

public class AuditorShould {

	@Test
	public void declareNumberOfFruitInShop() {
		FruitShop shop = new FruitShop();
		shop.add(Fruit.ORANGE, 5);

		int numberOfFruit = new Auditor().count(shop);

		assertEquals(5, numberOfFruit);
	}

}
