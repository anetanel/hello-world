package com.netanel.date;

public class TestMyDate {
	public static void main(String[] args) {
		MyDate d1 = new MyDate(2016, 2, 12);
//		System.out.println(d1.getDayOfWeek(2012, 2, 17));
		//System.out.println(d1);
//		//System.out.println(d1.nextDay());
//		
		for (int i = 0; i <1000; i++) {
			System.out.println(d1.nextDay());
		}
		
	}
}
