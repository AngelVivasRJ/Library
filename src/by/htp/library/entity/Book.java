package by.htp.library.entity;

@SuppressWarnings("unused")
public class Book {

	private String bookTitle;
	private int bookYearPubl;
	private int[] indexAuthor; // 4 Authors max

	public Book() {
		this.bookTitle = "";
		this.bookYearPubl = 0;
		this.indexAuthor = new int[4]; // 4 Authors max
		this.indexAuthor[0] = -1; // if indexAuthor[i] = (-1), without author.
		this.indexAuthor[1] = -1;
		this.indexAuthor[2] = -1;
		this.indexAuthor[3] = -1;
	}

	public Book(String bookTitle, int bookYearPubl, int indexAuthor0, int indexAuthor1, int indexAuthor2,
			int indexAuthor3) {
		this.bookTitle = bookTitle;
		this.bookYearPubl = bookYearPubl;
		this.indexAuthor = new int[4]; // 4 Authors max
		this.indexAuthor[0] = indexAuthor0;
		this.indexAuthor[1] = indexAuthor1;
		this.indexAuthor[2] = indexAuthor2;
		this.indexAuthor[3] = indexAuthor3;
	}

	public String getBookString() {
		return "Title: " + this.bookTitle + ". " + this.bookYearPubl + ".";
	}

	public int[] getBookAuthors() {
		return this.indexAuthor;
	}

}
