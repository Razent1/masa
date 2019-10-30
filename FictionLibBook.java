package com.telran.products.book;

public class FictionLibBook extends LibBook {
	private String genre;
	
	public FictionLibBook(String author, String title, int pages, int catNumber, boolean usage, String genre)
	{
		super(author, title, pages, catNumber, usage);
		
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		if(genre != null)
		this.genre = genre;
	}

	@Override
	public String toString() {
		return super.toString() + "\tGenre : " + genre;
	}
	
}
