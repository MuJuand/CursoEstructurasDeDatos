package ProjectMujuand;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import LinearDataStructures.List;

public class Mu {
	
	public static void main(String[] args) {
		
		Graph graph = new Graph();
		
		try {
			FileReader fr = new FileReader(new File("src\\dataset.txt"));
			
			BufferedReader br = new BufferedReader(fr);
			
			/*
			 * ignore
			 */
			br.readLine();
			br.readLine();
			br.readLine();
			br.readLine();
			
			String line = br.readLine();
			
			int last = -1;
			int count = 0;
			
			int [] elements = new int[1965206];
			
			while(line !=null ) {
				
				StringTokenizer st = new StringTokenizer(line,"\t");
			
				int data1 = Integer.parseInt(st.nextToken());
				
				if(data1!=last) {
					elements[count] = data1;
					count++;
					last = data1;
				}

				line = br.readLine();
			}
			
			Arrays.sort(elements);
			
			int [] dataNodes = new int [1965206];
			int j = 0;
			
			for (int i = elements.length -1; i >= 0; i--) {
				dataNodes[j] = elements[i];
				j++;
			}
			
			
			/**
			 * creating nodes
			 */
			
			System.out.println("termine de recorrer");
			for (int i = 0; i < dataNodes.length; i++) {
				graph.addNode(new NodeGraph(dataNodes[i]));
			}
			
			/**
			 * End creating node
			 */
			
			
			/**
			 * creating edges
			 */
			FileReader fr2 = new FileReader(new File("src\\dataset.txt"));
			
			BufferedReader br2 = new BufferedReader(fr2);
			
			/*
			 * ignore
			 */
			br2.readLine();
			br2.readLine();
			br2.readLine();
			br2.readLine();
			
			String line2 = br2.readLine();
			
			last = -1;
			count = 0;
			while(line2 !=null ) {
				
				StringTokenizer st2 = new StringTokenizer(line2,"\t");
			
				int data1 = Integer.parseInt(st2.nextToken());
				int data2 = Integer.parseInt(st2.nextToken());
				
				graph.addEdge(data1, data2);
				line2 = br2.readLine();
			}
			System.out.println("fin creacion conexiones");
			/**
			 * End creating edges
			 */
			NodeGraph n = (NodeGraph) graph.getNodes().get(0);
			
			n.getEdges().printList();
			
		}catch (IOException e) {
				e.printStackTrace();
				
		}
	}
	
}
