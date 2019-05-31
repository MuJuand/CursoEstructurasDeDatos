package Graphs;

import LinearDataStructures.List;

public class prueba {

	public static void main(String[] args) {
		
		
		NodeUndirectedGraph node1 = new NodeUndirectedGraph("01");
		NodeUndirectedGraph node2 = new NodeUndirectedGraph("01");
		
		NodeUndirectedGraph node3 = new NodeUndirectedGraph("03");
		
		
		
		if(node1.isEquals(node2)) {
			System.out.println("son iguales");
		}else {
			System.out.println("son diferentes");
		}
		
		node1.addConnection(node3);
		node2.addConnection(node1);
		
		List connectionsnod1 = node1.getConnections();
		
		
		
		
		
		
	}

}
