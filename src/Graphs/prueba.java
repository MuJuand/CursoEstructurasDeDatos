package Graphs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class prueba {
	
	public static void main(String[] args) {
		
		UndirectedGraph graph = new UndirectedGraph();

		try {
			
			FileReader fr = new FileReader(new File("src\\dataset.txt"));
			
			BufferedReader br = new BufferedReader(fr);
			
			br.readLine();
			br.readLine();
			br.readLine();
			br.readLine();
			
			String line = br.readLine();
			
			int last = -1;
			int count = 0;
			
			/*
			 * creacion de nodos
			 */
			while(line !=null ) {
				
				StringTokenizer st = new StringTokenizer(line,"\t");
			
				int data1 = Integer.parseInt(st.nextToken());
				
				if(data1!=last) {
					graph.insertNode(data1);
					count++;
					last = data1;
				}

				line = br.readLine();
			}
			
			/*
			 * creacion conexiones
			 */
			FileReader fr2 = new FileReader(new File("src\\dataset.txt"));
			BufferedReader bf2 = new BufferedReader(fr2);
			
			bf2.readLine();
			bf2.readLine();
			bf2.readLine();
			bf2.readLine();
			
			System.out.println("total nodos : " + count);
			line = bf2.readLine();
			int count2 = 0;
			while(line !=null ) {
				StringTokenizer st = new StringTokenizer(line,"\t");
				
				int data1 = Integer.parseInt(st.nextToken());
				int data2 = Integer.parseInt(st.nextToken());
				
				graph.insertConnection(data1, data2);
				count++;
				line = bf2.readLine();
			}
			System.out.println("total conexiones : " + count2);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}

}
