package com.netanel.shapes;

public class TestShape {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		Shape s2 = new Shape("blue", false);
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
