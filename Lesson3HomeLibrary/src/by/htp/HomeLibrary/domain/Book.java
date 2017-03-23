package by.htp.HomeLibrary.domain;

public class Book {
	private String name;
	private String author;
	private int publishingYear;
	
	public Book(String name, String author, int publishingYear){
		this.name=name;
		this.author=author;
		this.publishingYear=publishingYear;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublishingYear() {
		return publishingYear;
	}
	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	

}
