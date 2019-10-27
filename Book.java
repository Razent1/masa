
public class Book {
	private String author;
	private String title;
	private long ISBN;
	private int price;
	private int yearOfPublishing;
	
	public Book(String author, String title, long ISBN, int price, int yearOfPublishing) {
		setAuthor(author);
		setTitle(title);
		setPrice(price);
		setISBN(ISBN);	
		setyearOfPublishing(yearOfPublishing);
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setISBN(long ISBN) {
		if((ISBN <= 9_999_999_999_999l && ISBN >= 1_000_000_000_000l) || (ISBN >= 9_999_999_999l && ISBN <= 1_000_000_000l)) {
			this.ISBN = ISBN;
		}
			else {
				this.ISBN = -1;
				System.out.println(ISBN + " this ISBN is wrong");
			}
		}
	public long getISBN() {
		return ISBN;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getyearOfPublishing() {
		return yearOfPublishing;
	}
	public void setyearOfPublishing(int yearOfPublishing) {
		if(yearOfPublishing <= 2019 && yearOfPublishing >= 868) { //the first book was published in 868
			this.yearOfPublishing = yearOfPublishing;
		}
		else {
			this.yearOfPublishing = -1;
			System.out.println(yearOfPublishing + "year is wrong");
		}
	}
	public void display() {
		String info = "author: " + author + " title: " + title + " ISBN: " + ISBN + " price: " + price + " yaer of publishing: " + yearOfPublishing;
		System.out.println(info);
	}
}
