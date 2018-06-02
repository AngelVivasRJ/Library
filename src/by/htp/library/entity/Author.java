package by.htp.library.entity;

@SuppressWarnings("unused")
public class Author {
	private String authorName;
	private String authorPatronimic;
	private String authorSurName;
	private int authorYear;

	// Builder

	
	public Author() {
		this.authorName = "";
		this.authorPatronimic = "";
		this.authorSurName = "";
		this.authorYear = 0;
	}
	

	public Author(String authorName, String authorPatronimic, String authorSurName, int authorYear) {
		this.authorName = authorName;
		this.authorPatronimic = authorPatronimic;
		this.authorSurName = authorSurName;
		this.authorYear = authorYear;
	}

	public String getAuthorString() {
		if (!(this.authorPatronimic.equals(""))) {
			return this.authorName + " " + this.authorPatronimic + " " + this.authorSurName + " " + Integer.toString(this.authorYear) + ".";
		} else {
			return this.authorName + " " + this.authorSurName + " " + Integer.toString(this.authorYear) + ".";

		}
	}
}
