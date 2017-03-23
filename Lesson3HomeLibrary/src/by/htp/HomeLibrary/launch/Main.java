package by.htp.HomeLibrary.launch;


import java.util.ArrayList;
import java.util.Collections;

import by.htp.HomeLibrary.domain.Library;
import by.htp.HomeLibrary.domain.Book;
import by.htp.HomeLibrary.domain.Menu;
import by.htp.HomeLibrary.domain.NameComparator;
import by.htp.HomeLibrary.domain.PublishYearComparator;

public class Main {

	//private static ArrayList<Book> bookList;

	public static void main(String[] args) {
		ArrayList<Book> bookList=new ArrayList<>();
		Menu menu= new Menu();
		boolean answer= true;
		do{
			System.out.println("Do you want add new book to your library? yes/no ");
			answer = menu.wantAddNewBookOrNo();
			if (answer == true){
				//!!!!! посмотреть верна ли логика
				String name=menu.nameOfBook();
				String author= menu.authorOfBook();
				int year = menu.yearOfBook();
								
				Library book = new Library(name, author, year);
				bookList = book.addNewBook(bookList);
			}
		}
		while(answer==true);
		//Show entered library
		if(bookList.isEmpty()){
			System.out.print("You didn't add any books to your library!");
		}
		else{
			//
			Library show = new Library();
			System.out.println("Your library: ");
			show.showCurentLibrary(bookList);
				
			//Delete book
			System.out.println("Do you want delete some book? yes/no");
			answer = menu.wantAddNewBookOrNo();
			if (answer == true){
				Library book = new Library();
				String nameOfDelElement= menu.setNameElement();
				bookList = book.dellBook(bookList,nameOfDelElement);
			}
			//library after delete
			System.out.println("Your curent library: ");
			show.showCurentLibrary(bookList);
			//sort library
			System.out.println("Sort by publishing year: ");
			Collections.sort(bookList, new PublishYearComparator());
			show.showCurentLibrary(bookList);
			
			System.out.println("Sort by book name: ");
			Collections.sort(bookList, new NameComparator());
			show.showCurentLibrary(bookList);
			//find books
			System.out.println("Find book by auhtor: ");
			String nameAuthors=menu.findNameElement();
			String [] massString= nameAuthors.split(",");
			bookList = show.findBook(bookList, massString);
			show.showCurentLibrary(bookList);
		}
	}

	

}
