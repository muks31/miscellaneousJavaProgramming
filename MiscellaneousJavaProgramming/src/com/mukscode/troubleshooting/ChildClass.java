package com.mukscode.troubleshooting;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		
		ParentClass p = new ParentClass();
		//p.m1();
		ParentClass pc = new ChildClass();
		//pc.m1();
		ChildClass c = new ChildClass();
		c.m1();
		c.m2();
		c.m3();
	}
	
	@Override
	public void m1() {
		System.out.println("M");
	}
	public void m3() {
		System.out.println("R");
	}

}
