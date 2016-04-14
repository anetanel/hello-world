package com.netanel.parking;

public class TestParking {
	public static void main(String[] args) {
		Bike b1 = new Bike(12);
		Bike b2 = new Bike(10,"Red",24);
		
		Vehicle v1 = new Vehicle(98);
		Vehicle v2 = new Vehicle(94,"Blue",180);
		
		Car c1 = new Car(45);
		Car c2 = new Car(2012,"Green",210);
		
		Truck t1 = new Truck(4000, 98);
		Truck t2 = new Truck(12000, 2002, "Black", 175);

		
		Parking p1 = new Parking(5);
		System.out.println(p1);
		
		p1.parkNewTransport(b1);
		p1.parkNewTransport(b2);
		p1.parkNewTransport(t1);
		p1.parkNewTransport(t2);
		p1.parkNewTransport(c1);
		p1.parkNewTransport(c2);
		
		System.out.println(p1);
		
		p1.releaseTransport(2);
		p1.getParkingStatus();
		
		System.out.println(p1.getTransportByColor("white"));
		System.out.println(p1.getTransportByColor("blue"));
		System.out.println(p1.getTransportByColor("yellow"));
		
		System.out.println(p1.countVehicle());
		System.out.println(p1.countCar());
		
		System.out.println(p1.countTruckOfColorAndWeight("black", 500, 999999));
		
		
			
	}
}
