package org.ethz.day4.exercise5;

import java.util.ArrayList;

import org.ethz.day3.exercise4.Activity;
import org.ethz.day3.exercise4.PlanElement;


public class PlanImpl implements Plan {

	private double score;
	private ArrayList<PlanElement> planElements;	
	
	public PlanImpl(double score) {
		
		this.score = score;
		planElements = new ArrayList<PlanElement>();	
	}
	@Override
	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public double getScore() {
		return this.score;
	}

	@Override
	public ArrayList<PlanElement> getPlanElements() {
		return this.planElements;
	}

	@Override
	public void addLeg(Leg leg) {

		this.planElements.add(leg);
	}

	@Override
	public void addActivity(Activity act) {
		this.planElements.add(act);
	}

}
