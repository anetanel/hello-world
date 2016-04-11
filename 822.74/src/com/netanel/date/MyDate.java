package com.netanel.date;

public class MyDate {
	//
	// Attributes
	//
	private int year;
	private int month;
	private int day;
	private static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	private static String[] strDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	private static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	//
	// Constructors
	//
	
	public MyDate(int year, int month, int day)
	{
		setDate(year, month, day);
	}
	
	
	//
	// Methods
	//
	
	
	public static boolean isLeapYear(int year)
	// returns true if the given year is a leap year.
	// A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
	{
		return (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
	}
	

	public static boolean isValidDate(int year, int month, int day)
	// returns true if the given year, month, and day constitute a valid date.
	// Assume that year is between 1 and 9999, month is between 1 (Jan) to 12 (Dec) and day shall be 
	// between 1 and 28|29|30|31 depending on the month and whether it is a leap year on Feb	
	{
		if (!(month >= 1 && month <= 12))
		{
			return false;
		}
		int lastDay = daysInMonths[month-1];
		//Feb of a leap year = 29
		if (month == 2 && isLeapYear(year))
		{
			lastDay = 29;
		}
		return ((year >= 1 && year <= 9999) && (day >= 1 && day <= lastDay));
	}
	
	public static int getDayOfWeek(int year, int month, int day)
	// returns the day of the week, where 0 for Sun, 1 for Mon, ..., 6 for Sat, for the given date
	{
		int dayOfWeek = -1;
		
		// century number rotates between 4,2,0,6
		int centuryNumber = 0;
		// 0-11 are months on normal year, 12-13 are Jan and Feb on leap year
		int[] monthNumberArr = {0,3,3,6,1,4,6,2,5,0,3,5,6,2};
		int monthNumber;
		int lastTwoDigits = year % 100;
		
		switch (year/100 % 4)
		{
		case 1: centuryNumber = 4;
				break;
		case 2: centuryNumber = 2;
				break;
		case 3: centuryNumber = 0;
				break;
		case 0: centuryNumber = 6;
				break;
		}
		
		if (isLeapYear(year))
		{
			monthNumber = monthNumberArr[month+11];
		}
		else
		{
			monthNumber = monthNumberArr[month-1];
		}
		
		dayOfWeek = centuryNumber + lastTwoDigits + lastTwoDigits/4 + monthNumber + day;
		
		return dayOfWeek;
	}
	
	public void setDate(int year, int month, int day)
	{
		if (isValidDate(year, month, day))
		{
			setYear(year);
			setMonth(month);
			setDay(day);
		}
		else
		{
			System.out.println("Invalid year, month, or day!");
		}
	}
	
	public void setYear(int year)
	{
		if (year >= 1 && year <= 9999)
		{
			this.year = year;
		}
		else
		{
			System.out.println("Bad year!");
		}
	}
	
	public void setMonth(int month)
	{
		if (month >= 1 && month <= 12)
		{
			this.month = month;
		}
		else
		{
			System.out.println("Bad Month!");
		}
	}
	
	public void setDay(int day)
	{
		if (isValidDate(this.year, this.month, day))
		{
			this.day = day;
		}
		else
		{
			System.out.println("Bad Day!");
		}
	}
	
	//
	// toString
	//
	public String toString()
	{
		return this.day + "/" + this.month + "/" + this.year;
	}
}
