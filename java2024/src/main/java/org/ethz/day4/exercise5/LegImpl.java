package org.ethz.day4.exercise5;

import org.ethz.day3.exercise5.Vehicle;

public class LegImpl implements Leg {

	private String mode;
	private double departureTime;
	private double travelTime;
	private Vehicle vehicle;
	
	public LegImpl(){
	}
	
	public LegImpl(String mode, double departureTime, 
			double travelTime, Vehicle vehicle) {
		
		this.mode = mode;
		this.departureTime = departureTime;
		this.travelTime = travelTime;
		this.vehicle = vehicle;
	}
	
	@Override
	public String getMode() {
		return mode;
	}

	@Override
	public void setMode(String mode) {
		this.mode = mode;
	}

	@Override
	public double getDepartureTime() {
		return departureTime;
	}

	@Override
	public void setDepartureTime(double seconds) {
		this.departureTime = seconds;
	}

	@Override
	public double getTravelTime() {
		return travelTime;
	}

	@Override
	public void setTravelTime(double seconds) {
		this.travelTime = seconds;
	}

	@Override
	public void setVehicle(Vehicle v) {
		this.vehicle = v;
	}

	@Override
	public Vehicle getVehicle() {
		return this.vehicle;
	}

}
