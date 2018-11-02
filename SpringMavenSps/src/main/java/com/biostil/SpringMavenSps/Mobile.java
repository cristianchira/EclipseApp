package com.biostil.SpringMavenSps;

public enum Mobile{
	 
	APPLE("APL"),SAMSUNG("SA"),HUAWEI("Hu");
	
	private String name;
    Mobile(String name){
	  this.name = name;
  }
	public String getName() {
		return name;
	}
   /* public String toString(){
    	
    	return "Acestea sunt telefoanele: "+name;
    }*/
}