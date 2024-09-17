package org.ethz.day4.exercise5;

import java.util.ArrayList;

import org.ethz.day3.exercise4.Activity;
import org.ethz.day3.exercise4.PlanElement;

public interface Plan {

	public void setScore(double score);
	public double getScore();
	
	public ArrayList<PlanElement> getPlanElements();
	
	public void addLeg(final Leg leg);
	
	public void addActivity(final Activity act);
}
