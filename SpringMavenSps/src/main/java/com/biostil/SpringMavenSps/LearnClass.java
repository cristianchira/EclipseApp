package com.biostil.SpringMavenSps;


public class LearnClass implements IExtendedInterface{
    
	int info;

	@Override
	public void sMeth() {
		System.out.println("ILearnInterface");
		
	}

	@Override
	public void iextendexInterfaceMethod() {
		System.out.println("IExtendedInterface for LearnClass");
	
	}

	@Override
	public void nestMethod() {
		System.out.println("Implemented by LearnClass");
		
	} 
	
}
