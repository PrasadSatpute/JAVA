package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderTest {

	static Scanner sc = new Scanner(System.in);
	
	ArrayList<Product> orders = new ArrayList<Product>();
	
	
	void menuDriven() {
		System.out.println("1.Add Product");
		System.out.println("2.Remove Product");
		System.out.println("3.Order Price");
		System.out.println("4.Print Order");
		
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			try {
			
				addProduct();
				
			}
			catch (Exception e) {
				System.out.println("Pleas Select Valid Option");
			}
			
			break;
		case 2:
			try {
				
				removeProduct();
				
			}
			catch (Exception e) {
				System.out.println("Pleas Select Valid Option");
			}
			break;
		case 3:
			try {
				
				orderPrice();
				
			}
			catch (Exception e) {
				System.out.println("Pleas Select Valid Option");
			}
			break;
		case 4:
			try {
				
				printOrder();
				
			}
			catch (Exception e) {
				System.out.println("Pleas Select Valid Option");
			}
			break;
		
			
		default:
			System.out.println("Invalid Case");
			break;
		}
	}
	
	
	private void printOrder() {
		
		
		
	}


	private void orderPrice() {
		// TODO Auto-generated method stub
		
	}


	


	private void addProduct() {
		
		Product prod = new Product();
		
		System.out.println("Enter Product ID : ");
		prod.setID(sc.nextInt());
		
		System.out.println("Enetr Product Name : ");
		prod.setName(sc.nextLine());
		
		System.out.println("Enter Product Price : ");
		prod.setPrice(sc.nextInt());
		
		orders.add(prod);
	}
	
	private void removeProduct() {
		System.out.println("Enter Product Name That You Want to Remove : ");
		String productName = sc.nextLine();
		orders.removeIf(order -> order.getName().contains(productName));
	}


	public static void main(String[] args) {
		
		OrderTest ordertest = new OrderTest();
		ordertest.menuDriven();

	}

}
