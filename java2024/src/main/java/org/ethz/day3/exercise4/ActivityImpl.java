package org.ethz.day3.exercise4;

public class ActivityImpl implements Activity {

	private double endTime;
	private String type;
	private double xCoord;
	private double yCoord;
	
	public  ActivityImpl(double endTime, String type, 
			double xCoord, double yCoord) {
		
		this.endTime = endTime;
		this.type = type;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	@Override
	public double getEndTime() {
		return this.endTime;
	}

	@Override
	public void setEndTime(final double seconds) {
		this.endTime = seconds;
	}

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public void setType(final String type) {
		this.type = type;
	}

	@Override
	public double getXCoord() {
		return this.xCoord;
	}

	@Override
	public void setXCoord(final double xCoord) {
		this.xCoord = xCoord;
	}

	@Override
	public double getYCoord() {
		return this.yCoord;
	}

	@Override
	public void setYCoord(double yCoord) {
		this.yCoord = yCoord;
	}

}
