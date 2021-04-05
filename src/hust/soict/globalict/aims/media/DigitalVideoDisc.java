package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Media {
	
	private String director;
	private int length;
	

	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	public DigitalVideoDisc(String title, String category, String director) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	 public boolean search( String title) {
		String[] DiscTitle= this.title.split("\\s");
		String[] tokens  = title.split("\\s");
		int count =0;
 		 for(int i =0;i<tokens.length; i++)
 		 {
 			 for(int j=0;j<DiscTitle.length;j++) {
 				 if(tokens[i].equals(DiscTitle[j])) count ++;
 			 }
 		 }
		
 		 if( count<tokens.length) return false;
 		 else return true;
	
		
	}

	
	
}
