package org.ethz.day3.exercise5;

public final class Car extends Vehicle {
	
	private int capacity;
	private double length;
	private String manufacturer;
	
	public Car(String id, int capacity, double length,
			String manufacturer) {
		
		super(id);
		this.capacity = capacity;
		this.length = length;
		this.manufacturer = manufacturer;
	}

	public int getCapacity() {
		return capacity;
	}

	public double getLength() {
		return length;
	}

	public String getManufacturer() {
		return manufacturer;
	}

}
