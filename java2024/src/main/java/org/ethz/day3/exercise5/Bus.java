package org.ethz.day3.exercise5;

public class Bus extends Vehicle {
	
	private int sittingCapacity;
	private int standingCapacity;
	private double length;
	private String company;
	
	public Bus(String id, int sittingCapacity, int standingCapacity,
			double length, String company) {
		
		super(id);
		this.length = length;
		this.standingCapacity = standingCapacity;
		this.sittingCapacity = sittingCapacity;
		this.company = company;		
	}
	
	public int getSittingCapacity() {
		return sittingCapacity;
	}
	public int getStandingCapacity() {
		return standingCapacity;
	}
	public double getLength() {
		return length;
	}
	public String getCompany() {
		return company;
	}

}
