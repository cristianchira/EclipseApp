package com.biostil.SpringMavenSps;

interface Top {
    default String name() {
    	System.out.println("Return  name from Top interface");
    	return "unnamed"; }
}