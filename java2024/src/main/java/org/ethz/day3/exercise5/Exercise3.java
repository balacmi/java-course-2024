package org.ethz.day3.exercise5;

import org.ethz.day3.exercise3.Link;
import org.ethz.day3.exercise3.Node;

public class Exercise3 {

	public static void main(String[] args) {

		Node fromNode = new Node(0.0, 0.0, "0");
		Node toNode = new Node(0.0, 50.0, "1");
		String[] allowedModes = new String[2];
		allowedModes[0] = "car";
		allowedModes[1] = "pt";
		Link link = new Link("1", fromNode, toNode, 50, 50, 10, allowedModes);
		
		VehiclesOnLink vehiclesOnLink = new VehiclesOnLink(link);
		
		Car car1 = new Car("1", 4, 2.2, "Ford");
		Bus bus1 = new Bus("2", 40,30, 2.2, "ZVV");
		vehiclesOnLink.addVehicle(car1);
		vehiclesOnLink.addVehicle(bus1);
		System.out.println("Capacities of all vehicles currently on the link are:");

		vehiclesOnLink.printCapacities();
		
		vehiclesOnLink.removeVehicle(car1);
		System.out.println();
		System.out.println("Capacities of all vehicles currently on the link are:");

		vehiclesOnLink.printCapacities();

		boolean ind = vehiclesOnLink.removeVehicle(car1);
		System.out.println(ind);
	}

}
