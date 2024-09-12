package org.ethz.day3.exercise5;

import org.ethz.day3.exercise3.Link;

public class VehiclesOnLink {
	
	private Link link;
	private Vehicle[] vehicles;
	private int numberOfVehiclesOnLink = 0;
	
	public VehiclesOnLink(Link link) {
		
		this.vehicles = new Vehicle[100];
		this.numberOfVehiclesOnLink = 0;
	}
	
	/**
	 * Method that adds a vehicle to the link
	 * 
	 *@return true if there was space for the new vehicle and false otherwise
	 */
	public boolean addVehicle(Vehicle v){
		
		if (this.numberOfVehiclesOnLink < 100) {
			
			vehicles[this.numberOfVehiclesOnLink++] = v;
			return true;
		}
		
		return false;		
	}

	/**
	 * Method that removes a specific vehicle from the link
	 * 
	 *@return true if the vehicle was in the list and false otherwise
	 */
	public boolean removeVehicle(Vehicle v){
		int i;
		if (v == null)
			return false;
		
		for(i = 0 ; i < this.numberOfVehiclesOnLink; i++){
			if(vehicles[i].equals(v))
				break;
		}
		if (i == this.numberOfVehiclesOnLink)
			return false;
		int j = i;
		//we move all vehicles one position to the left
		//starting from the vehicle after the one we were
		//searching for
		for (; j < this.numberOfVehiclesOnLink - 1; j++) {
			
			vehicles[j] = vehicles[j + 1];
		}
		//we have to make the last existing element null
		//because we already moved it one position to the left
		
		vehicles[j] = null;
		this.numberOfVehiclesOnLink--;
		return true;		
	}
	
	public void printCapacities() {
		
		for (Vehicle v : this.vehicles) {
			
			if (v != null) {
				
				if (v instanceof Bus) {
					System.out.println("Total capacity of the bus " + v.getId() + " is: " + 
				
							((Bus) v).getSittingCapacity() + ((Bus) v).getStandingCapacity());
				}
				else if (v instanceof Car) {
					System.out.println("Total capacity of the car " + v.getId() + " is: " + 
				((Car) v).getCapacity());
				}
			}
		}
	}
	public Link getLink() {
		return link;
	}

	public Vehicle[] getVehicles() {
		return vehicles;
	}

	public int getNumberOfVehiclesOnLink() {
		return numberOfVehiclesOnLink;
	}
	
	

}
