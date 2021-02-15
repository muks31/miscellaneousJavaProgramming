package com.mukscode.troubleshooting;

public abstract class AbstractClassConceptTest {
	
	int num;
	String name;
	
	AbstractClassConceptTest(String name, int num){
		this.name = name;
		this.num = num;
	}

	public void m1() 
	{
		System.out.println("Mukku");
	}
	
	public abstract void m2();
}
