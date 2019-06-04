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
 * Implementación
 * 
 */

public class prueba {

	public static void main(String[] args) {
		
		/***
		 * Inicio cálculo temporal implementacion grafo
		 */
		long startTimeImplementacion = System.nanoTime();  
		
		GraphList graph = new GraphList();

		try {
			
			FileReader fr = new FileReader(new File("src\\dataset.txt"));
			
			BufferedReader br = new BufferedReader(fr);
			
			/*
			 * saltos de lineas fútiles
			 */
			br.readLine();
			br.readLine();
			br.readLine();
			br.readLine();
			
			String line = br.readLine();
		
			int count = 0;
			
			/**
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
			/**
			 * fin creacion de nodos y conexiones
			 */
			
			
			long estimatedTimeImplementacion = System.nanoTime() - startTimeImplementacion;
			/***
			 * fin cálculo temporal implementacion grafo
			 */
					
			/****
			 * Inicio cálculo temporal algoritmo BFS
			 */
			long startBfs = System.nanoTime(); 
			
			BreadthFirstSearch bfs = new BreadthFirstSearch(graph);
			
			int start = 666;
			
			int goal = 999666;
			
			List <Integer> camino = bfs.shortestPath(start, goal);
			
			System.out.println("Camino mas corto del nodo " + start 
					+ " al nodo " + goal + " es:\n" );
			System.out.println(Arrays.toString(camino.toArray()));
			
			System.out.println("\npasos : " + (camino.size()-1));
			
			long estimatedTimeBfs = System.nanoTime() - startBfs;
			
			/****
			 * fin cálculo temporal algoritmo BFS
			 */
			
			double timeBfs = estimatedTimeBfs / Math.pow(10, 9);
			
			double timeImplementacion = estimatedTimeImplementacion / Math.pow(10, 9);
					
			System.out.println();
			System.out.println("Tiempo implementacion Grafo : " + timeImplementacion + " segundos");
			System.out.println();
			System.out.println("Tiempo implementacion BFS : " + timeBfs + " segundos");
						
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
}
