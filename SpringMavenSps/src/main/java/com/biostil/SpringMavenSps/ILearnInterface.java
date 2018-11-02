package com.biostil.SpringMavenSps;

interface ILearnInterface {
     int ty =9;
	 int inf =485;
	 String str=null;
	 void sMeth();
	
	 default  void isRauta(){
		System.out.println("I'm a a bad girl");
	 }
		static void staticMethod(){
			System.out.println("This is a static method fromILearnInterface");
		}
     interface INestInterface{
		int nest= 1452;
		void nestMethod();
	 default void defaultnestedMethod(){
			System.out.println("this is default nested method  from INestInterface");
	 }
	static void statictNestedMethod(){
		System.out.println("this is static nested methhod from INestInterface");
		
	} 	
	}
}
