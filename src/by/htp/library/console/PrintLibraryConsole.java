package by.htp.library.console;

import by.htp.library.entity.Author;
import by.htp.library.entity.Book;
import by.htp.library.entity.CatalogAuthor;
import by.htp.library.entity.CatalogBooks;

@SuppressWarnings("unused")
public class PrintLibraryConsole {

	public PrintLibraryConsole() {
		System.out.println("I am a console");
	}

	public void printAuthor(String author) {
		System.out.println("Author: " + author);
	}

	public void printBook(Book book, CatalogAuthor catalogAuthor) {
		System.out.println();
		System.out.println(book.getBookString());
		for (int z = 0; z < 4; z++) {
			if (book.getBookAuthors()[z] != -1) {
				printAuthor(catalogAuthor.getAuthorByIndex(book.getBookAuthors()[z]).getAuthorString()); // Que consiga
																											// y muestre
																											// en
																											// pantalla
			}
		}
	}

	public void printCatalogBooks(CatalogBooks catalogBooks, CatalogAuthor catalogAuthor) {
		if (catalogBooks.getCatalogBooksLenght() == -1) {
			System.out.println("Catalog of books is empty...");
		} else {
			for (int i = 0; i <= catalogBooks.getCatalogBooksLenght(); i++) {
				printBook(catalogBooks.getBookByIndex(i), catalogAuthor);
			}
		}
	}

}