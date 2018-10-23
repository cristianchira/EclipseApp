package com.biostil.SpringMavenSps;

public class Restaurant {
	
	IHotDrink hotDrink;
	
	Restaurant(IHotDrink hotDrink){
		this.hotDrink = hotDrink;
		}
	
	public void prepareHotDrink(){
		hotDrink.prepareHotDrink();
		}
	}


