package by.htp.HomeLibrary.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

public class Library {
	private String name;
	private String author;
	private int year;
	
	public Library(String name, String author, int year) {
		this.name=name;
		this.author=author;
		this.year=year;
	}
	public Library(){
		
	}

	
	public Library(String nameOfDelElement) {
	}
	
	public  ArrayList<Book> addNewBook(ArrayList<Book> bookList){
		bookList.add(new Book(name,author,year));
		return bookList;
	}
	
	public  ArrayList<Book> dellBook(ArrayList<Book> bookList, String nameOfDelElement){
		if (bookList.isEmpty()==false){
			
			for (ListIterator<Book> i = bookList.listIterator(); i.hasNext(); ) {
				   Book el = i.next();
				   if(el.getName().contains(nameOfDelElement)){
				      i.remove();
				      }
			}
		}
		else{
			System.out.println("Your library already empty!");
		}
		return bookList;
	}
	
	
	public void showCurentLibrary(ArrayList<Book> bookList){
		for(Book e: bookList){
			System.out.println("Book: "+e.getName()+ " by author "+e.getAuthor()+", "+e.getPublishingYear()+" year.");
		}
	}
	public  ArrayList<Book> findBook(ArrayList<Book> bookList, String[] massString){
		//some code to find book by one author
//		ArrayList<Book> found = new ArrayList<Book>();
//		for(Book e: bookList){
//			if(e.getAuthor().equals(nameAuthor)){
//				found.add(e);
//			    System.out.println("Found!!!!!"); 
//			}
//				if(found.isEmpty()){
//					System.out.println("Coudn't find the book with author "+e.getAuthor()+" ");
//				}
//		}
		
		//some code to find book by one and more authors
		//separate full string via comma
		ArrayList<Book> found = new ArrayList<Book>();
		HashSet<String> hashSet = new HashSet<String>();
		for(String e: massString){
			hashSet.add(e.toString());
			//hashSet.add("felix");
		}
		for(Book e: bookList){
			String bookAuthor =e.getAuthor();
			for(String h : hashSet){
				if(h.contains(bookAuthor)){
					found.add(e);
				}
			}
		}
		if(!found.isEmpty()){
			System.out.println("You found: ");
		}
		else{
			System.out.println("Couldn't find anything!");
		}
		return found;
	}
	

}
