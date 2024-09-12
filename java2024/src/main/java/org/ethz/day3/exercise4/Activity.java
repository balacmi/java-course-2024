package org.ethz.day3.exercise4;

public interface Activity extends PlanElement {
	
	public double getEndTime();
	
	/*  final keyword in this context has the following meaning:
		we want to make sure that seconds value is not changed in this method and then assigned to
		the endTime for this activity 
		if the seconds was of the reference type, we would not be able to change the
		object which seconds was pointing to, but we would be able
		to change the information stored in the object
	*/	
	public void setEndTime(final double seconds);
	
	public String getType();
	
	public void setType(final String type);
	
	public double getXCoord();
	
	public void setXCoord(final double xCoord);
	
	public double getYCoord();
	
	public void setYCoord(final double yCoord);

}
