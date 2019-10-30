package com.telran.products.book;

public class AudioLibBook extends LibBook {
	private double duration;
	private int size;

	public AudioLibBook(String author, String title, int pages, int catNumber, boolean usage, double duration, int size) {
		super(author, title, pages, catNumber, usage);
		this.setDuration(duration);
		this.setSize(size);
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		if(duration > 0)
		this.duration = duration;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size > 0)
		this.size = size;
	}

	@Override
	public String toString() {
		return super.toString() + "\tDuration : " + duration + "\tSize : " + size;
	}

}
