
public class Book {
	private String title;
	private String imageURL;
	private String ISBN;
	private String link;
	
	public Book(String nTitle, String nImageURL, String nISBN, String nLink)
	{
		title=nTitle;
		imageURL=nImageURL;
		ISBN = nISBN;
		link = nLink;
	}
	
	public String getTitle() {return title;}
	public String getImageURL() {return imageURL;}
	public String getISBN() {return ISBN;}
	public String getLink() {return link;}
}
