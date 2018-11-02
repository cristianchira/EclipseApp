package com.biostil.SpringMavenSps;

public interface Left extends Top {
	 default String names() {
		 System.out.println("Return name from Left");
		 return getClass().getName(); }
}
