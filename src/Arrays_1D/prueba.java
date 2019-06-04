package Arrays_1D;

import java.util.Random;

public class prueba {
	
	public static void main(String[] args) {
		
		
		int [] arr = new int[100000];
		
		Random r = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100000);
			System.out.print(arr[i] + " ");		
		}
		System.out.println();
		System.out.println();
		quickSort(0, arr.length - 1, arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");		
		}
		
		
	}
	public static void quickSort(int inicio, int fin , int[] unsortedArray)
	{
		int i = inicio;
		int j = fin;
		int central = unsortedArray[(inicio + fin)/2];
		do {
			while(central > unsortedArray[i]) {
				i++;
			}
			while(central < unsortedArray[j]) {
				j--;
			}
			
			if(i<=j) {
				int temp = unsortedArray[i];
				unsortedArray[i] = unsortedArray[j];
				unsortedArray[j] = temp;
				i++;
				j--;
			}
		} while (i<=j);
		
		if(inicio < j) {
			quickSort(inicio,j,unsortedArray);
		}
		if(fin > i) {
			quickSort(i, fin, unsortedArray);
		}
	}

}
