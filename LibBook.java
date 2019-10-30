package com.telran.products.book;

public class LibBook extends Book {
	private int catNumber;
	private boolean usage;
	
	public LibBook(String author, String title, int pages, int catNumber, boolean usage)
	{
		super(author, title, pages);
		this.setCatNumber(catNumber);
		this.setUsage(usage);
	}

	public int getCatNumber() {
		return catNumber;
	}

	public void setCatNumber(int catNumber) {
		this.catNumber = catNumber;
	}

	public boolean isUsage() {
		return usage;
	}

	public void setUsage(boolean usage) {
		this.usage = usage;
	}

	@Override
	public String toString() {
		return super.toString() + "\tCat. Number : " + catNumber + "\t Used : " + usage;
	}
	

}
