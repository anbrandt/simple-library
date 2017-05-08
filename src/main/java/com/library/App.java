package com.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {

		Book book1 = new Book("Lord of the Rings"); //tworzenie nowych obiektów o klasie Book
		Book book2 = new Book("Star Trek");
		Book book3 = new Book("Star Wars");
		Book book4 = new Book("Hobbit");
		Book book5 = new Book("Star Wars 3");
		Book book6 = new Book("Star Wars 2");

		List<Book> booksForLibrary = new ArrayList<Book>();

		booksForLibrary.add(book1);
		booksForLibrary.add(book2);
		booksForLibrary.add(book3);
		booksForLibrary.add(book4);
		booksForLibrary.add(book5);
		booksForLibrary.add(book6);

		Library localLibrary = new Library(booksForLibrary); //creating new library object with parametres of acquiredBooks library

//		booksForLibrary.remove(book4); //remove book4 object from the list bookForLibrary
//		System.out.println(booksForLibrary.size()); // print out the size of the list BookForLibrary


//		localLibrary.allBooks.remove(book3); //remove book from object locallibrary from list allBooks
//		localLibrary.removeBook(book5); //on object localLibrary use method removeBook (declared in Libarary.java).


//		localLibrary.removeBookByTheTitle("Star Trek");

	Book borrowedBook = localLibrary.borrowBook("Hobbit");
		System.out.println("Borrowed book is " + borrowedBook.getTitle());

		localLibrary.removeBookUsingSearchMethod("Star Trek");

		Book bookToReturn = borrowedBook;//tworzenie referencji pokazującej na ten sam obiekt
		boolean returnSuccess = localLibrary.returnBook(bookToReturn);

		System.out.println(returnSuccess);
	//        localLibrary.addBook(book1);
//        localLibrary.addBook(book2);
//        localLibrary.addBook(book3);
//		System.out.println(borrowedBook.getTitle() + " is borrowed");
//		localLibrary.removeBookUsingSearchMethod("Lord of The Rings");
//		localLibrary.removeBookByTheTitle("Hobbit");
//		localLibrary.removeBookUsingSearchMethod("Lord of the Rings");
//		System.out.println(localLibrary.removeBookUsingSearchMethod("Lord of the Rings"));

		System.out.println(localLibrary.allBooks.size());//sprawdzamy liczbę elementów w liście allBooks przez metodę size. printujemy

	}
}
