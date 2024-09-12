package org.ethz.day3.exercise3;

public final class Link {
	
	private Node fromNode;
	private Node toNode;
	private String id;
	private double length;
	private int allowedSpeed;
	private double capacity;
	private String[] modes;	
	
	public Link(String id, Node fromNode, Node toNode, double length,
			int allowedSpeed, double capacity, String[] modes){
		this.id = id;
		this.fromNode = fromNode;
		this.toNode = toNode;
		this.length = length;
		this.allowedSpeed = allowedSpeed;
		this.capacity = capacity;
		this.modes = modes;
	}
	
	public String getId() {
		return id;
	}
	
	public Node getFromNode() {
		return fromNode;
	}
	
	public Node getToNode() {
		return toNode;
	}
	
	public String[] getModes() {
		return modes;
	}	
		
	public double getLength() {
		return length;
	}	
	
	public int getAllowedSpeed() {
		return allowedSpeed;
	}

	public double getCapacity() {
		return capacity;
	}
}
