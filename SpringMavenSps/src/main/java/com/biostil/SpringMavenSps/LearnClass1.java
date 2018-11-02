package com.biostil.SpringMavenSps;

public class LearnClass1 implements IExtendedInterface {

	@Override
	public void sMeth() {
		System.out.println("ILearn interface implementd in LearnClass1");
		
	}

	@Override
	public void iextendexInterfaceMethod() {
		System.out.println("IExtended interface implementd in LearnClass1");
		
	}

	@Override
	public void nestMethod() {
		System.out.println("Implemented by LearnClass1");
		
	}


}
