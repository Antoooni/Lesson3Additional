package by.htp.HomeLibrary.launch;

import by.htp.HomeLibrary.domain.Book;
import by.htp.HomeLibrary.domain.Library;

public class Main {

	public static void main(String[] args) {
		Book bookArray[] = new Book[3];
		bookArray[0] = new Book("Book of love", "felix Jaehn", 2015);
		bookArray[1] = new Book("Sap CRM", "Mazets", 1995);
		bookArray[2] = new Book("Crime and punishment", "Dostoevsky", 1866);

		Library l = new Library(bookArray);
		System.out.println("Your library(added): ");
		l.showLibrary(bookArray);
		bookArray = l.addBookToLibrary(bookArray, "Java", "Shildt", 2017);
		System.out.println('\n'+"Now your library(after adding): ");
		l.showLibrary(bookArray);
		bookArray = l.sortByYear(bookArray);
		System.out.println('\n'+"Sorted library by publishing year: ");
		l.showLibrary(bookArray);
		String nameOfDeteteBook="Sap CRM";
		bookArray = l.dellBookFromLibrary(bookArray, nameOfDeteteBook);
		System.out.println('\n'+"Library without book "+nameOfDeteteBook);
		l.showLibrary(bookArray);
		String stringWithAutors = "Shildt,Dostoevsky";
		System.out.println('\n'+"Found book by authors "+stringWithAutors+": ");
		bookArray = l.findBookByAuthor(bookArray, stringWithAutors);

	}

}
