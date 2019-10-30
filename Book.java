package com.telran.products.book;

public class Book {
	private String title;
	private String author;
	private int pages;
	
	public Book(String author, String title, int pages)
	{
		this.setPages(pages);
		this.setTitle(title);
		this.setAuthor(author);
	}
	
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		if(title != null)
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		if(author != null)
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		if(pages < 100000)
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Title : " + title + "\tAuthor : " + author + "\tPages : " + pages;
	}
	
	
}
