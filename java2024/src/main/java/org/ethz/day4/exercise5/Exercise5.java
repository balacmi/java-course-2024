package org.ethz.day4.exercise5;

import org.ethz.day3.exercise4.Activity;
import org.ethz.day3.exercise4.ActivityImpl;
import org.ethz.day3.exercise4.PlanElement;
import org.ethz.day3.exercise5.*;
public class Exercise5 {

	public static void main(String[] args) {

		PlanImpl plan = new PlanImpl(100);
		
		Vehicle car = new Car("0", 4, 6.0, "Ford");
		
		ActivityImpl act1 = new ActivityImpl(3600.0, "Home", 0.0, 0.0);		
		LegImpl leg1 = new LegImpl("car", 7000, 100, car);
		ActivityImpl act2 = new ActivityImpl(5000.0, "Work", 100.0, 100.0);
		LegImpl leg2 = new LegImpl("car", 8000, 100, car);
		ActivityImpl act3 = new ActivityImpl(7200.0, "Home", 0.0, 0.0);		
		
		plan.addActivity(act1);
		plan.addLeg(leg1);
		plan.addActivity(act2);
		plan.addLeg(leg2);
		plan.addActivity(act3);
		
		for (PlanElement pe : plan.getPlanElements()) {			
			if (pe instanceof Activity)
				System.out.print(((Activity) pe).getType() + " ");
			else if (pe instanceof Leg) 
				System.out.print(((Leg) pe).getMode() + " ");
		}		
	}
}
