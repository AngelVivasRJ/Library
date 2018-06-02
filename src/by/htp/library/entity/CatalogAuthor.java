package by.htp.library.entity;

@SuppressWarnings("unused")
public class CatalogAuthor {

	private Author[] catalogAuthors;
	private int catalogAuthorsLength;

	public CatalogAuthor() {
		this.catalogAuthorsLength = -1; // this catalog is empty if catalogAuthorsLength = -1
		this.catalogAuthors = new Author[100]; // 100 authors max.
	}

	public void addCatalogAuthor(Author catalogAuthors) {
		this.catalogAuthorsLength = getCatalogAuthorsLength() + 1;
		this.catalogAuthors[getCatalogAuthorsLength()] = catalogAuthors;
	}

	public void addCatalogAuthor(String authorName, String authorPatronimic, String authorSurName, int authorYear) {
		this.catalogAuthorsLength = getCatalogAuthorsLength() + 1;
		this.catalogAuthors[getCatalogAuthorsLength()] = new Author(authorName, authorPatronimic, authorSurName,
				authorYear);
		// see ...
	}

	public int getCatalogAuthorsLength() {
		return this.catalogAuthorsLength;
	}

	public Author getAuthorByIndex(int indexAuthor) {
		if ((getCatalogAuthorsLength() < indexAuthor) || (0 > indexAuthor)) {
			System.out.println("Error in index of authors");
			return null;
		} else {
			return this.catalogAuthors[indexAuthor];
		}
	}

	public int getIndexAuthorSearch(Author author) {
		boolean found1 = false;
		int w1 = 0;
		if (!(this.catalogAuthorsLength < 0)) {
			do {
				if (this.catalogAuthors[w1].equals(author)) {
					found1 = true;
				}
				w1++;
			} while ((!found1) && (w1 <= this.catalogAuthorsLength));
		}
		if (found1) {
			return (w1 - 1);
		} else {
			return -1; // This Author is not registered
		}
	}

}
