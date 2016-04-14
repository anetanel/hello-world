package com.netanel.parking;

public class Parking {
	//
	// Attributes
	//
	private Transport[] transports;
	private int currentNum;

	//
	// Constructors
	//
	public Parking(int numOfParkingSpots) {
		transports = new Transport[numOfParkingSpots];
	}

	//
	// Getters
	//
	public int getCurrentNum() {
		return currentNum;
	}

	//
	// Functions
	//

	public void parkNewTransport(Transport transport) {
		// Adds a Transport to the transports array (parks a transport in the
		// lot)
		if (currentNum < transports.length) {
			// Find an empty slot
			for (int i = 0; i < transports.length; i++) {
				if (transports[i] == null) {
					transports[i] = transport;
					currentNum++;
					System.out.println("New transport added to slot " + i + ".");
					break;
				}
			}
		} else {
			System.out.println("No more parking spots left!");
		}
	}

	public void releaseTransport(int slotNumber) {
		// removes a Transport from the transports array (releases a transport
		// from the lot)
		if (slotNumber < 0 || slotNumber >= transports.length) {
			System.out.println("Invalid parking spot number!");
			return;
		}
		if (transports[slotNumber] != null) {
			transports[slotNumber] = null;
			currentNum--;
		} else {
			System.out.println("Parking spot " + slotNumber + " is already empty!");
		}
	}

	public void getParkingStatus() {
		for (int i = 0; i < transports.length; i++) {
			if (transports[i] == null) {
				System.out.println("Spot " + i + ": Empty");
			} else {
				System.out.println("Spot " + i + ": " + transports[i]);
			}

		}
	}

	public Transport getTransportByColor(String color) {
		// returns the first occurrence of a transport with given color.
		// if not found, a default transport is returned.
		for (int i = 0; i < transports.length; i++) {
			if (transports[i] == null) continue;
			if (transports[i].getColor().toUpperCase().equals(color.toUpperCase())) {
				return transports[i];
			}
		}
		System.out.println("Color " + color + " not found! Returning default Transport.");
		return new Transport();
	}
	
	//
	// toString
	//
	@Override
	public String toString() {
		return "Parking lot has " + currentNum + " spots taken out of " + transports.length + ".";
	}
}
