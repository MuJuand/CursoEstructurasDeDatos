package Project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * 
 * @author Juan David Guerrero Pérez
 * 
 * MuJuanD 
 * 
 */

public class prueba {

	
	public static void main(String[] args) {
		
		
		GraphList graph = new GraphList();

		try {
			
			FileReader fr = new FileReader(new File("src\\dataset.txt"));
			
			BufferedReader br = new BufferedReader(fr);
			
			br.readLine();
			br.readLine();
			br.readLine();
			br.readLine();
			
			String line = br.readLine();
		
			int count = 0;
			
			/*
			 * creacion de nodos y conexiones
			 */
			while(line !=null ) {
				
				StringTokenizer st = new StringTokenizer(line,"\t");
			
				int data1 = Integer.parseInt(st.nextToken());
				
				int data2 = Integer.parseInt(st.nextToken());
				
				graph.insertarConexion(data1, data2);
				
				line = br.readLine();
				count++;
			}
			
			
			BreadthFirstSearch bfs = new BreadthFirstSearch(graph);
			
			List <Integer> camino = bfs.shortestPath(0, 1804539);
			
			System.out.println(Arrays.toString(camino.toArray()));
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	
	
	
}
