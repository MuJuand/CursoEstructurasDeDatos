package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese el numero de conductores");
		
		int n = Integer.parseInt(bf.readLine().trim());
		
		int [] rutasMañana = new int [n];
		
		int [] rutasTarde = new int [n];
		
		System.out.println("Ingrese el valor de la hora normal");
		
		int p = Integer.parseInt(bf.readLine());
		
		System.out.println("Introduzca el valor de duracion, d");
		
		int d = Integer.parseInt(bf.readLine());
		
		
		
	}
	
	/*
	 * este método recibelas rutas de la mañana y de la tarde, y las retorna
	 * cambiando la distribución de las horas extra, para disminuir el pago
	 * retorno, rutas[0] , sera rutas dia, y rutas[1], sera rutas tarde
	 */
	
	public static int [][] distribuirHoras(int [] rutasMañana, int [] rutasTarde, int n, int d){
		
		int distribucion[][] = new int[n][n];
		
		//primero se dejara como horas maximas d el valor de cada ruta, si es mayor 
		//se realizara la sumatoria de las rutas con exceso y se repartiran 
		//entre los trabajadores
		
		
		
		
		
		return distribucion;
	}
	 
	

}
