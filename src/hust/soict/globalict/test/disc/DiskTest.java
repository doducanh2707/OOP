package hust.soict.globalict.test.disc;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.order.Order;

public class DiskTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order anOrder =new Order();
		Order secondOrder= new Order();
		DigitalVideoDisc [] dvdList= new DigitalVideoDisc[3];
		DigitalVideoDisc dvd1=new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Aller");
		dvd1.setLength(87);
					dvdList[0]=dvd1;
		anOrder.addMedia(dvd1);
		
		DigitalVideoDisc dvd2=new DigitalVideoDisc("Star War");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("Geogre Lucas");
		dvd2.setLength(124);
		
		anOrder.addMedia(dvd2);
		dvdList[1]=dvd2;

		DigitalVideoDisc dvd3=new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		anOrder.addMedia(dvd3);

		dvdList[2]=dvd3;
		
		 DigitalVideoDisc dvd4 = new DigitalVideoDisc("Sherlock Homes");
		 	dvd4.setCost(175f);
	   
	     DigitalVideoDisc dvd5= new DigitalVideoDisc("Harry Potter and the Deathly Hallows II", "Fantasy", "David Yates", 175 , 69.5f);
	      
	     DigitalVideoDisc dvd6= new DigitalVideoDisc("Harry Potter and the Order of Phoenix", "Fantasy", "David Yates", 147 , 96.5f);
	
			System.out.println(dvd6.search("Harry Order"));
			System.out.println (anOrder.totalCost());
			//secondOrder.getALuckyItem();
			System.out.println (secondOrder.totalCost());
			//anOrder.printList();
	
		
	}
	}

