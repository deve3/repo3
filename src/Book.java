
public class Book {

	private String title;
	private String category;
	private int size;
	
	public Book(String title){
		this.title = title;
	}
	public Book(){
		setSize(0);
	}

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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public getPrix(){
		return 1000 * size;
	}
	
}
