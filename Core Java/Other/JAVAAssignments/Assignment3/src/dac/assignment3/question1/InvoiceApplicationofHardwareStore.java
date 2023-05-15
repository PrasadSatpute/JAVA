package dac.assignment3.question1;

import java.util.Scanner;

class Invoice
{
	Scanner sc = new Scanner(System.in);
	
	String partNo;
	String partDescription;
	int quantity;
	double price;
	
	
	
//public Invoice(String partNo, String partDescription, int quantity, double price) {
//		super();
//		this.partNo = partNo;
//		this.partDescription = partDescription;
//		this.quantity = quantity;
//		this.price = price;
//	}
	public Invoice() {
		
		
		System.out.println("Enter Part Number : ");
//		partNo = sc.nextLine();
		setPartNo(sc.nextLine());
		System.out.println("Enter Part Description : ");
//		partDescription = sc.nextLine();
		setPartDescription(sc.nextLine());
		System.out.println("Enter Quantity of Item : ");
//		quantity = sc.nextInt();
		setQuantity(sc.nextInt());
		System.out.println("Enter Price Per Item : ");
//		price = sc.nextDouble();
		setPrice(sc.nextDouble());
		
	}
	
	
	public String getPartNo() {
		return partNo;
	}
	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity < 0)
		{
			this.quantity = 0;
		}
		else
		{
			this.quantity = quantity;
		}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price < 0)
		{
			this.price = 0.0;
		}
		else
		{
			this.price = price;
		}
	}

	public double getInvoiceAmount(int qnty, double pri) {
		
		return qnty*pri;
		
	}


	public void printInvoice() {
		
		System.out.println(
				"Part no. : "+getPartNo()+
				"\nPart Desc. :"+getPartDescription()+
				"\nQuantity of Item:"+getQuantity()+
				"\nPrice per Item :"+getPrice()+
				"\nTotal Price of Item :"+getInvoiceAmount(quantity, price));
		
	}
	
	
}

public class InvoiceApplicationofHardwareStore {

	public static void main(String[] args) {
		
		//Invoice app = new Invoice("wood01", "Wooden Sticks", 10, 100);
		
		Invoice app1 = new Invoice();
		System.out.println("Invoice");
		app1.printInvoice();
		
		Invoice app2 = new Invoice();
		System.out.println("Invoice");
		app2.printInvoice();
		
		Invoice app3 = new Invoice();
		System.out.println("Invoice");
		app3.printInvoice();
		
		Invoice app4 = new Invoice();
		System.out.println("Invoice");
		app4.printInvoice();
		
	}

}
