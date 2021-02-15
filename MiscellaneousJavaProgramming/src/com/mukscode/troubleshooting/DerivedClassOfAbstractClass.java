package com.mukscode.troubleshooting;

public class DerivedClassOfAbstractClass extends AbstractClassConceptTest{

	DerivedClassOfAbstractClass(String name, int num) {
		super(name, num);
		}

	@Override
	public void m2() {
		System.out.println("Muks");
		
	}
	
	public static void main(String[] args) {
		AbstractClassConceptTest abs = new DerivedClassOfAbstractClass("Muks", 5);
		DerivedClassOfAbstractClass d = new DerivedClassOfAbstractClass("Mukes",4);
		abs.m1();
		abs.m2();

	}
	

}
