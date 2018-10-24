package com.biostil.SpringMavenSps;

public class Tea implements IHotDrink {

	@Override
	public void prepareHotDrink() {
		System.out.println("Dear ,we are prepare hot drink for you");
	}
}
