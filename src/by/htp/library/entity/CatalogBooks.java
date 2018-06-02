package by.htp.library.entity;

@SuppressWarnings("unused")
public class CatalogBooks {
	private Book[] catalogBooks;
	private int catalogBooksLenght;

	public CatalogBooks() {
		this.catalogBooksLenght = -1;
		this.catalogBooks = new Book[200]; // 200 books max.
	}

	public int getCatalogBooksLenght() {
		return this.catalogBooksLenght;
	}

	public void addCatalogBooks(Book book) {
		this.catalogBooksLenght = this.getCatalogBooksLenght() + 1;
		this.catalogBooks[this.getCatalogBooksLenght()] = book;

	}

	public void addCatalogBooks(String title, int yearOfPubl, int indexAuthor0, int indexAuthor1, int indexAuthor2,
			int indexAuthor3) {
		this.catalogBooksLenght = this.catalogBooksLenght + 1;
		this.catalogBooks[this.catalogBooksLenght] = new Book(title, yearOfPubl, indexAuthor0, indexAuthor1,
				indexAuthor2, indexAuthor3);
	}

	public Book getBookByIndex(int indexBook) {
		if ((indexBook < 0) || (indexBook > this.getCatalogBooksLenght())) {
			System.out.println("Error in book index");
			return null;
		} else {
			return this.catalogBooks[indexBook];
		}
	}



}
