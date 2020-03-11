package com.test;

public class Sample3 implements Sample,Sample2{
	@Override
	public void face1() {
		System.out.println("kash");
		
	}

	@Override
	public void face2() {
		System.out.println("boss");
	}

	@Override
	public void face3() {
		System.out.println("chinthabass");
		
	}

	@Override
	public void face4() {
	System.out.println("kashyap");
		
	}
	public static void main(String[] args) {
		Sample3 s=new Sample3();
		s.face1();
		s.face2();
		s.face3();
		s.face4();
	}
	

}
