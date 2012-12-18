import java.util.ArrayList;


public class AppLauncher {

	public static void main(String[] args) {
		XMLBookImporter xmlBookImporter = new XMLBookImporter();
		ArrayList<Book> books = xmlBookImporter.getBooks();
		BubbleBookSorter sorter = new BubbleBookSorter();
		books = sorter.sortBooks(books);
		for(Book b : books){
			System.out.println(b.getTitle());
		}
		
	}

}
