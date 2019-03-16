package exercisesAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class Market {

	public static void main(String[] args) throws IOException {
		
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
	List<Product> products = new ArrayList<>();
	
	final Product rice = new Product("Rice", 1900);
	final Product milk = new Product("Milk", 3200);
	final Product bread = new Product("Bread", 2000);
	final Product toothpaste = new Product("toothpaste", 4800);
	final Product deodorant = new Product("Deodorant", 9700);
	final Product chicken = new Product("Chicken", 9900);
	final Product sugar = new Product("Sugar", 2000);
	final Product salt = new Product("Salt", 2000);
	final Product spaghettis = new Product("spaghetti", 2400);
	final Product cheese = new Product("cheese", 5000);
	
	products.add(rice);
	products.add(milk);
	products.add(bread);
	products.add(toothpaste);
	products.add(deodorant);
	products.add(chicken);
	products.add(sugar);
	products.add(salt);
	products.add(spaghettis);
	products.add(cheese);
	
	
	int id = 0;
	System.out.println("||¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯||");
	for (Product product : products) {
		System.out.printf("||Id: %d\t||Product: %s \t||Price: %d||\n", id ,product.getName(),product.getPrice());
		id++;
	}
	System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
	
	System.out.println("Do you want to buy a product?");
	System.out.println("Enter y, for yes");
	System.out.println("Enter n, for no");
	
	String temp = bf.readLine();
	
	while(!temp.equals("y") && !temp.equals("n") ) {
		System.out.println("Enter a valid option");
		System.out.println("Enter y, for yes");
		System.out.println("Enter n, for no");
		temp = bf.readLine();
	}
	
	int [] totalUnits = new int[10];
	
	if(temp.equals("y")) {
		do {
			
			System.out.println("Enter product id");
			
			temp = bf.readLine();
				
			while(temp.length()>2 ) {
				System.out.println("Enter a valid id ");
				System.out.println("Enter number  0 <= id <= 9");
				temp = bf.readLine();
			}
			
			id = Integer.parseInt(temp);
			
			System.out.println("Enter number of units");
			temp = bf.readLine();
			int units = Integer.parseInt(temp);
			
			totalUnits[id] = units;
			
			System.out.println("Do you want to buy a product?");
			System.out.println("Enter y, for yes");
			System.out.println("Enter n, for no");
			
			temp = bf.readLine();
			
			while(!temp.equals("y") && !temp.equals("n") ) {
				System.out.println("Enter a valid option");
				System.out.println("Enter y, for yes");
				System.out.println("Enter n, for no");
				temp = bf.readLine();
			}
			
			if(temp.equals("n")) {
				int sum = 0;
				for (int i = 0; i < totalUnits.length; i++) {
					if(totalUnits[i]!=0) {
						System.out.printf("Product: %s \t|| Units: %d \t|| Price : %d||\n", 
								products.get(i).getName(), totalUnits[i], products.get(i).getPrice()* totalUnits[i]);
						
						sum = sum + (products.get(i).getPrice()* totalUnits[i]);
						
					}
				}
				System.out.println("\nTotal Price : \t " + sum);
				
			}
			
			
		}while(temp.equals("y"));
	}
	
	
	
	
	
	}

}
