package org.ethz.day3.exercise3;

public class TestNetwork {

	public static void main(String[] args) {

		Node[] nodes = new Node[4];
		Link[] links = new Link[4];
		
		//create a simple rectangular network
		String[] allowedModes = new String[2];
		allowedModes[0] = "car";
		allowedModes[1] = "pt";
		nodes[0] = new Node(0.0, 0.0, "0");
		nodes[1] = new Node(100.0, 0.0, "1");
		nodes[2] = new Node(100.0, 50.0, "2");
		nodes[3] = new Node(0.0, 50.0, "3");
		
		links[0] = new Link("0", nodes[0], nodes[1], 100.0, 
				50, 50.0, allowedModes);
		links[1] = new Link("1", nodes[1], nodes[2], 50.0, 
				50, 50.0, allowedModes);
		links[2] = new Link("2", nodes[2], nodes[3], 100.0, 
				50, 50.0, allowedModes);
		links[3] = new Link("3", nodes[3], nodes[0], 50.0, 
				50, 50.0, allowedModes);
		
		Network testNetwork = new Network(nodes, links);
		
		System.out.println("Coordinates of all nodes in the network are:");
		for (Node node : testNetwork.getNodes()) {
			
			System.out.println("Node with id " + node.getId() + 
			": X coordinate is: " + node.getX() + " and Y coord is: " + node.getY());
		}

	}

}
