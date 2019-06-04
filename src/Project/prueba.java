package Project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;


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
			 * creacion de nodos
			 */
			while(line !=null ) {
				
				StringTokenizer st = new StringTokenizer(line,"\t");
			
				int data1 = Integer.parseInt(st.nextToken());
				
				int data2 = Integer.parseInt(st.nextToken());
				
				graph.insertarConexion(data1, data2);
				
				line = br.readLine();
				count++;
			}
			
			Set <Integer> lista = graph.getNode(0).getConexiones().keySet();
			
			System.out.println(Arrays.toString(lista.toArray()));
			
			for (Integer integer : lista) {
				System.out.println(integer);
			}
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
}
