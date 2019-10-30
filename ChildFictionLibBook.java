package com.telran.products.book;

public class ChildFictionLibBook extends LibBook {
	private int age;
	public ChildFictionLibBook(String author, String title, int pages, int catNumber, boolean usage, int age) {
		super(author, title, pages, catNumber, usage);
		this.setAge(age);
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <= 14)
		this.age = age;
	}
	@Override
	public String toString() {
		return super.toString() + "\tAge : " + age;
	}

}
