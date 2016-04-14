package com.netanel.parking;

public class Bike extends Transport {
	//
	// Attributes
	//
	private int gear;
	
	//
	// Constructors
	//
	public Bike(int gear) {
		super();
		this.gear = gear;
	}
	
	public Bike(int gear, String color, int maxVelocity) {
		super(color, maxVelocity);
		this.gear = gear;
	}
	
	//
	// Getters
	//
	public int getGear() {
		return gear;
	}
	
	//
	//toString
	//
	@Override
	public String toString() {
		return "A Bike with " + gear + " gears. Is " + super.toString(); 
	}
}
