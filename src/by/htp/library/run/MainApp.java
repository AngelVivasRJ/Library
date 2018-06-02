package by.htp.library.run;

import by.htp.library.console.PrintLibraryConsole;
import by.htp.library.entity.Author;
import by.htp.library.entity.Book;
import by.htp.library.entity.CatalogAuthor;
import by.htp.library.entity.CatalogBooks;
import by.htp.library.entity.SearchCatalogBooksByAuthor;
import by.htp.library.entity.SearchCatalogBooksByBook;

public class MainApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CatalogAuthor catalogAuthor = new CatalogAuthor();
		CatalogBooks catalogBooks = new CatalogBooks();
		PrintLibraryConsole printLibraryConsole = new PrintLibraryConsole();

		CatalogBooks catalogBooksSearch = new CatalogBooks();

		Author author0 = new Author("Angel", "", "Vivas", 1976);
		Author author2 = new Author("Vladimir", "Vladimirovish", "Putin", 1950);
		Author author1 = new Author("John", "", "Miller", 1914);
		Author author3 = new Author("Donald", "", "Trump", 1915);
		catalogAuthor.addCatalogAuthor("Sergei", "Ivanovish", "Pushkin", 1913);
		catalogAuthor.addCatalogAuthor(author3);
		catalogAuthor.addCatalogAuthor("Barack", "", "Obama", 1850);
		catalogAuthor.addCatalogAuthor(author2);
		catalogAuthor.addCatalogAuthor(author1);
		catalogAuthor.addCatalogAuthor("Angela", "", "Merkel", 1943);
		catalogAuthor.addCatalogAuthor("Mariano", "", "Rajoy", 1951);

		/**
		 * printLibraryConsole.printAuthor(author.getAuthorString());
		 * printLibraryConsole.printAuthor(catalogAuthor.getAuthorByIndex(0).getAuthorString());
		 * printLibraryConsole.printAuthor(catalogAuthor.getAuthorByIndex(1).getAuthorString());
		 * printLibraryConsole.printAuthor(catalogAuthor.getAuthorByIndex(6).getAuthorString());
		 * printLibraryConsole.printAuthor(catalogAuthor.getAuthorByIndex(2).getAuthorString());
		 **/

		Book book0 = new Book("OTAN in the XXI century", 2018, 0, 1, 4, 3);
		Book book1 = new Book("OTAN in the XX century", 2002, 0, 1, 2, 3);
		Book book2 = new Book("Foreing relations", 2016, 2, 4, 5, -1);
		Book book3 = new Book("Comparative literature", 1975, 0, 1, 4, -1);
		catalogBooks.addCatalogBooks("Russian literature", 1971, 0, 1, -1, -1);
		catalogBooks.addCatalogBooks(book3);
		catalogBooks.addCatalogBooks("North American foreing relations", 2012, 0, 1, 2, 3);
		catalogBooks.addCatalogBooks(book2);
		catalogBooks.addCatalogBooks(book1);
		catalogBooks.addCatalogBooks("International economic relations", 2003, 6, 5, 4, 3);
		catalogBooks.addCatalogBooks("The Euro Zone", 2010, 5, 6, -1, -1);

		System.out.println("");
		System.out.println(">>>> Show a book");
		printLibraryConsole.printBook(book2, catalogAuthor); // Show a book
		System.out.println("");

		System.out.println(">>>> Show all books");
		printLibraryConsole.printCatalogBooks(catalogBooks, catalogAuthor); // Show all books
		
		System.out.println("");
		System.out.println(">>>> Find book by book");
		SearchCatalogBooksByBook searchCatalogBooksByBook = new SearchCatalogBooksByBook(book2, catalogBooks); // Set
																												// and
																												// search
																												// book
																												// by
																												// book
		if (searchCatalogBooksByBook.getFounded()) {
			System.out.println("The founded book  is:");
			printLibraryConsole.printBook(searchCatalogBooksByBook.getBook(), catalogAuthor);
		} else {
			System.out.println("This book was not found ");
		}

		System.out.println("");
		System.out.println(">>>> Find book by book");
		SearchCatalogBooksByBook searchCatalogBooksByBook1 = new SearchCatalogBooksByBook(book0, catalogBooks); // Set
																												// and
																												// search
																												// book
																												// by
																												// book
		if (searchCatalogBooksByBook1.getFounded()) {
			System.out.println("The founded book  is:");
			printLibraryConsole.printBook(searchCatalogBooksByBook1.getBook(), catalogAuthor);
		} else {
			System.out.println("This book was not found ");
		}
		
		System.out.println("");
		SearchCatalogBooksByAuthor searchCatalogBooksByAuthor = new SearchCatalogBooksByAuthor(author2, catalogBooks,
				catalogAuthor); // set author
		System.out.println("");
		printLibraryConsole.printAuthor(author2.getAuthorString()); // set author
		System.out.println(">>>> The result of search by author is:");
		if (searchCatalogBooksByAuthor.getFoundedBook()) {
			printLibraryConsole.printCatalogBooks(searchCatalogBooksByAuthor.getCatalogBooks(), catalogAuthor);
		} else {
			System.out.println("There are not books with this author.");
		}

		System.out.println("");
		SearchCatalogBooksByAuthor searchCatalogBooksByAuthor1 = new SearchCatalogBooksByAuthor(author0, catalogBooks,
				catalogAuthor); // set author
		System.out.println("");
		printLibraryConsole.printAuthor(author0.getAuthorString()); // set author
		System.out.println(">>>> The result of search by author is:");
		if (searchCatalogBooksByAuthor1.getFoundedBook()) {
			printLibraryConsole.printCatalogBooks(searchCatalogBooksByAuthor1.getCatalogBooks(), catalogAuthor);
		} else {
			System.out.println("There are not books with this author.");
		}
		
	}

}
