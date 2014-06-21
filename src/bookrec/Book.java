package bookrec;

public class Book {
	private String title;
	private String imageURL;
	private String ISBN;
	private String link;
	private String author;
	
	public Book(String nTitle, String nImageURL, String nISBN, String nLink, String nAuthor)
	{
		title=nTitle;
		imageURL=nImageURL;
		ISBN = nISBN;
		link = nLink;
		author = nAuthor;
	}
	
	public String getTitle() {return title;}
	public String getImageURL() {return imageURL;}
	public String getISBN() {return ISBN;}
	public String getLink() {return link;}
	public String getAuthor() {return author;}
}
