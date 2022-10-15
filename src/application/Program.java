package application;

import java.util.*;
import entities.Product;

public class Program {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);	
		Product pro = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		pro.nome = scan.nextLine();
		System.out.print("Price: ");
		pro.price = scan.nextDouble();
		System.out.print("Quantity: ");
		pro.quantity = scan.nextInt();
		
		System.out.println("Product data: " + pro);
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = scan.nextInt();
		pro.addProducts(quantity);

		System.out.println("Update data: " + pro);
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = scan.nextInt();
		pro.removeProducts(quantity);

		System.out.println("Update data: " + pro);
		
        scan.close();

	}

}
