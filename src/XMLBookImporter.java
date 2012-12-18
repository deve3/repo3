import java.util.ArrayList;


public class XMLBookImporter implements IBookImporter{

	@Override
	public ArrayList<Book> getBooks() {
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book("UML case studies"));
		books.add(new Book("XML for every one"));
		// implement the code here
		System.out.println("Books imported from XML source ...");
		return books;
	}

}
