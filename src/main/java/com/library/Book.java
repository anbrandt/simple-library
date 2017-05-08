package com.library;

/**
 * Created by andrzej on 27.04.17.
 */
public class Book {

	public void setTitle(String title) {
		this.title = title;
	}

	private String title;

	public String getTitle() {
		return title;
	}

	public Book(String title) {
		this.title = title;
	}


}
