package com.netanel.tests;

import com.netanel.complex.MyComplex;

public class TestMyComplex {
	public static void main(String[] args) {
		MyComplex c1 = new MyComplex(10, 5);
		MyComplex c2 = new MyComplex(10, 5);
		
		String s1 = c1.toString();
		String s2 = c2.toString();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println("Some text");
		System.out.println("some text2");
		
	}
}
