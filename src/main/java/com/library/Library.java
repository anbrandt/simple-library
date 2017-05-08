package com.library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by andrzej on 27.04.17.
 */
public class Library {


	List<Book> allBooks = new ArrayList<Book>();

	//biblioteka ma książki, które przechowuje w liście. Gdy Books podnosimy do pamięci będzie obiektem typu Lista, o klasie Book.java
	//lista jest drugim typem kolekcji. Lista inaczej alokuje pamięć, bez INDEKSU

	// konstruktor Library

	Library(List<Book> acquiredBooks)
	{
		allBooks.addAll(acquiredBooks);//adding allBooks list to new list acquiredBooks
	}

	public void addBook(Book book) {
		allBooks.add(book); //dodajemy książkę do listy
	}

	public void removeBook(Book book) {
		allBooks.remove(book); //removing book from the list
	}

	//metoda pożyczająca książkę
	public Book borrowBook(String title) {
		return searchBookByTitle(title);

	}

	public boolean returnBook(Book bookToReturn) {

		Book bookFound = searchBook(bookToReturn);
		boolean bookToReturnResult = false;

		if(bookFound != null) {
			bookToReturnResult = bookToReturn == bookFound;
		}

		return bookToReturnResult;
	}

	//metoda która będzie kasowała książkę po tytule, którą przekażemy po metodzie
	public void removeBookByTheTitle(String titleBook) {

		boolean isBookToDelete = false;
		int idx = 0;
		Book book = null;

		while (isBookToDelete == false) {
			book = allBooks.get(idx);
			isBookToDelete = book.getTitle().equals(titleBook);
			idx++;
		} //dopóki boolean nie wywali true, dopóty będzie iterował

		if (isBookToDelete == true)
			allBooks.remove(book);
		System.out.println("removed book " + book.getTitle());
	}

	public boolean isBookBorrowed() {

		return false;
	}

	public void removeBookUsingSearchMethod(String titleBook) {
		Book bookFound = searchBookByTitle(titleBook); //tworzenie zmiennej lokalnej bookFound i wywoływanie metody searcbookbytutle
		if (bookFound != null)
			allBooks.remove(bookFound); //remove bookFound variable from the list alBooks by method remove
	}

	/* po stworzeniu metody searchBookByTitle możemy użyć jej dla metody stworzony wcześniej - removeBookbyTitle.
	Book bookFound = searchBookByTitle(bookTitle); //tworzenie zmiennej lokalnej bookFound
	if (bookFound != null)
		allBooks.remove(bookFound);

	 */

	public Book searchBook(Book book) {
		return searchBookByTitle(book.getTitle());
	}

	//do wypożyczenia książki potrzebujemy metody wyszukującej książkę po tytule w liście allbooks

	public Book searchBookByTitle(String title) {

		boolean isBookFound = false;
		int idx = 0;
		Book book = null;

		while (isBookFound == false) {
			book = allBooks.get(idx);
			isBookFound = book.getTitle().equals(title);
			idx++;
		}


		return book;
	}

}


