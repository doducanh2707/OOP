package hust.soict.globalict.aims.media;

public class Media {
	protected String title; 
	protected String category;
	float cost;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	public Media(String title){
		this.title = title;
		}
	Media(String title,String category){
			this(title);
			this.category = category;
			}
	public Media() {
		// TODO Auto-generated constructor stub
	}
	

}
