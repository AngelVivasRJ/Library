package by.htp.library.entity;

@SuppressWarnings("unused")
public class SearchCatalogBooksByBook {
	private boolean founded;
	private Book book;

	public SearchCatalogBooksByBook() {
		this.founded = false;
		this.book = new Book();
	}

	public SearchCatalogBooksByBook(Book book, CatalogBooks catalogBooks) {
		if (catalogBooks.getCatalogBooksLenght() < 0) {
			this.founded = false;
			this.book = new Book();
		} else {
			int i = 0;
			this.founded = false;
			do {
				if (catalogBooks.getBookByIndex(i).equals(book)) {
					this.book = book;
					this.founded = true;
				}
				i++;
			} while ((i <= catalogBooks.getCatalogBooksLenght()) && !this.founded);
			if (!this.founded) {
				this.book = new Book();
			}
		}
	}

	public boolean getFounded() {
		return this.founded;
	}

	public Book getBook() {
		return this.book;
	}
}
