package hust.soict.globalict.aims.media;

import java.util.ArrayList;


public class Books extends Media{

	private ArrayList<String> authors= new ArrayList<String>();
	
	
	 public ArrayList<String> getAuthors() {
		return authors;
	}
	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	public void addAuthor(String authorName){
		for(String au : authors) {
			if(au.equals(authorName)) {System.out.println("This author already exits in this class");
			return;}
		}
		authors.add(authorName);
	}
	 public void removeAuthor(String authorName) {
		for(String au : authors) {
			if(au.equals(authorName)) authors.remove(authorName);
			
		} 
		 
	 }
	   public Books(String title){
		 super(title);
		 }
	 public Books(String title, String category){
			 super(title, category);
			 }
	 Books(String title, String category,ArrayList<String> authors){
			 super(title, category);
			 this.authors = authors;
			 //TODO: check author condition
			 }
	public Books() {
		// TODO Auto-generated constructor stub
	}

}
