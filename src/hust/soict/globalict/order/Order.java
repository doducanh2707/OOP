package hust.soict.globalict.order;

import java.util.ArrayList;

import hust.soict.globalict.aims.media.Media;

public class Order {
	public static final int MAX_NUMBERS_ORDERS=10;
	public static final int MAX_LIMITED_ORDERS =5;
	public static final int id=0;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public void addMedia(Media med) {
		if(itemsOrdered.size() >MAX_NUMBERS_ORDERS - 1 ) 
			{System.out.println("Cannot add more order");
				return;}
		itemsOrdered.add(med);
		
	}
	public void removeMedia(Media med) {
		for(Media au : itemsOrdered) {
			if(au.getTitle().equals(med.getTitle())) {
				itemsOrdered.remove(au);
				break;
			}
		}
	}
	public void removeMedia(String s) {
		for(Media au : itemsOrdered) {
			if(au.getTitle().equals(s)) itemsOrdered.remove(au);
		}
	}
	public float totalCost() {
		float Cost=0;
		for(Media med : itemsOrdered)
		{
			Cost +=med.getCost();
		}
		return Cost;
		
	}
//	public void printList() {
//		dateOrdered.print();
//		 System.out.println("*********************Order*********************");
//		System.out.println("Ordered items: \n");
//		for(int i=0;i<qtyOrdered;i++) {
//			System.out.println((i+1)+".DVD - "+itemOrdered[i].getTitle()+" - "+itemOrdered[i].getCategory()+" - "+itemOrdered[i].getDirector()+" - "
//							+itemOrdered[i].getLength()+" : "+itemOrdered[i].getCost()+"$");
//			
//			
//		}
//		System.out.println("Total cost: "+ totalCost());
//		 System.out.println("***********************************************");
//}



	}

