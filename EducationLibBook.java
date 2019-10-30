package com.telran.products.book;

public class EducationLibBook extends LibBook {
	private String subject;

	public EducationLibBook(String author, String title, int pages, int catNumber, boolean usage, String subject) {
		super(author, title, pages, catNumber, usage);
		this.setSubject(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if(subject != null)
		this.subject = subject;
	}

	@Override
	public String toString() {
		return super.toString() + "\tSubject : " + subject;
	}
	

}
