package RepasoProyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import Graphs.UndirectedGraph;

public class Prueba {
	
public static void main(String[] args) {
		
		GraphList graph = new GraphList();

		try {
			
			FileReader fr = new FileReader(new File("src\\dataset3.txt"));
			
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
					graph.insertarInicio(new NodoGrafoMu(data1));
					System.out.println(data1);
					count++;
					last = data1;
				}

				line = br.readLine();
			}
			
			/*
			 * creacion conexiones
			 */
			System.out.println("empece a ordernar");
			graph.quickSort(0, graph.getTamano() - 1, graph);
			System.out.println("termine de ordenar");
			
			for (int i = 0; i < graph.getTamano(); i++) {
				NodoGrafoMu nodo = graph.obtener(i);
				System.out.println(nodo.getData());
			}
			
		
		}catch (IOException e) {
			e.printStackTrace();
			
		}

	}
}
