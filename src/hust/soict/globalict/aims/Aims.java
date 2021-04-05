package hust.soict.globalict.aims;
import java.util.ArrayList;
import java.util.Date;

import hust.soict.globalict.aims.media.Books;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.order.Order;
import java.util.Scanner;
public class Aims {
	public static final int MAX_LIMITED_ORDERS =5;
	private static ArrayList<Order> Orders = new ArrayList<Order>();
	static int i=-1;
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");

		Scanner scanner =new Scanner(System.in);
	 	int option= Integer.parseInt(scanner.nextLine());
	 	switch(option) {
	 		case 1: 
	 				Order anOrder = new Order();
	 				Orders.add(anOrder);
	 				if(i>3) {
	 					System.out.println("Cannot add more order");
	 					break;
	 				}
	 				i++;
	 				int j=i+1;
	 				System.out.println(j+ " order has been created");
	 				showMenu();
	 				
	 		default : break;
	 		case 2: 
	 			if(i<0) System.out.println("No order has been created");
	 			else {
	 				System.out.println("Please choose type of media:\n1.Books\n2.DVD");
	 				int type=Integer.parseInt(scanner.nextLine());
	 			
	 				System.out.println("Please enter title :");
	 					String  title = scanner.nextLine();
	 					System.out.println("Please enter category :");	
	 					String category= scanner.nextLine();
	 					System.out.println("Please enter cost :");
	 					float cost=Float.parseFloat(scanner.nextLine()) ;
	 					if(type == 1) { 
	 						Books book =new Books(title,category);
	 						book.setCost(cost);
	 						Media book1 = (Media)book;
	 						Orders.get(i).addMedia(book);
	 						System.out.println(i);
	 					}
	 					if(type == 2) {
	 						System.out.println("Please enter director name :");
	 						String director= scanner.nextLine();
	 						System.out.println("Please enter length :");
	 						int length = Integer.parseInt(scanner.nextLine());
	 						DigitalVideoDisc dvd= new DigitalVideoDisc(title,category,director);
	 						dvd.setLength(length);
	 						Media dvd1 = (Media)dvd;
	 						Orders.get(i).addMedia(dvd1);
	 					}
	 				System.out.println(title+" has been successfully added to Order");
	 			}
	 			showMenu();

	 		case 3: 
	 			System.out.println("Please enter items you want to delete :");
	 			String name = scanner.nextLine();
	 			Media au= new Media(name);
	 			Orders.get(i).removeMedia(au);
	 			showMenu();
	 	}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			showMenu();
	
	}

}
