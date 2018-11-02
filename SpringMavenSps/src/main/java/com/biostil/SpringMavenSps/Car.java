package com.biostil.SpringMavenSps;

import java.util.ArrayList;
import java.util.List;

public class Car {
	
   static  String tring ="GGGGG";
	
   public void publish(int n, Mobile...data) { // (int, String[])
	   for(Mobile d:data){
	   System.out.println(d.name());
	   
	 }
   }
 public void someMeth(Car this){
	System.out.println(this.getClass()); 
	 
 }
 public static  <E> boolean containsElement(E [] elements, E element){
	    for (E e : elements){
	        if(e.equals(element)){
	        	System.out.println("Element "+element+" is there!");
	            return true;
	        }
	    }
	    return false;
	}
  
}