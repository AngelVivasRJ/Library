package by.htp.library.entity;

@SuppressWarnings("unused")
public class SearchCatalogBooksByAuthor {
	private boolean foundedAuthor;
	private boolean foundedBook;
	private CatalogBooks catalogBooks;

	public SearchCatalogBooksByAuthor() {
		this.foundedAuthor = false;
		this.foundedBook = false;
		this.catalogBooks = new CatalogBooks();
	}

	public SearchCatalogBooksByAuthor(Author author, CatalogBooks catalogBooks, CatalogAuthor catalogAuthor) {
		this.catalogBooks = new CatalogBooks();
		this.foundedBook = false;
		int tempIndexAuthor = catalogAuthor.getIndexAuthorSearch(author);
		int indexAuthorTemp[] = new int[4]; // 4 authors max.

		if (-1 == tempIndexAuthor) {
			this.foundedAuthor = false;
		} else {	
			this.foundedAuthor = true;
			for (int x = 0; x <= catalogBooks.getCatalogBooksLenght(); x++) {
				indexAuthorTemp = catalogBooks.getBookByIndex(x).getBookAuthors();
				if ((indexAuthorTemp[0] == tempIndexAuthor) || (indexAuthorTemp[1] == tempIndexAuthor)
						|| (indexAuthorTemp[2] == tempIndexAuthor) || (indexAuthorTemp[3] == tempIndexAuthor)) {
					this.foundedBook = true;
					this.catalogBooks.addCatalogBooks(catalogBooks.getBookByIndex(x));
				}
			}

		}
	}

	public CatalogBooks getCatalogBooks() {
		return this.catalogBooks;
	}
	
	public boolean getFoundedAuthor() {
		return this.foundedAuthor;		
	}
	
	public boolean getFoundedBook() {
		return this.foundedBook;
	}



}
