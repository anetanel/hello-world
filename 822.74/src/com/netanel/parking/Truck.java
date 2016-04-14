package com.netanel.parking;

public class Truck extends Vehicle {
	//
	// Attributes
	//
	private int weight;

	//
	//Constructors
	//
	public Truck(int weight, int model) {
		super(model);
		this.weight = weight;
	}
	public Truck(int weight, int model, String color, int maxVelocity) {
		super(model, color, maxVelocity);
		this.weight = weight;
	}

	//
	// Getters
	//
	public int getWeight() {
		return weight;
	}
	
	//
	//Setters
	//
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//
	// toString
	//
	@Override
	public String toString() {
		return "a Truck, weighing " + weight + ", which is " + super.toString();
	}
	
	

}
