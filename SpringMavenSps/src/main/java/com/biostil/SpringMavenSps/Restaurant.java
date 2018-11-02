package com.biostil.SpringMavenSps;

public class Restaurant {
	
	IHotDrink hotDrink;
	
	public void setHotDrink(IHotDrink hotDrink){
		this.hotDrink = hotDrink;
		}
	
	public void prepareHotDrink(){
		hotDrink.prepareHotDrink();
		}
	}


