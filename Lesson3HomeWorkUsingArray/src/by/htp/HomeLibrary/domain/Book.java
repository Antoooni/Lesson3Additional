package by.htp.HomeLibrary.domain;

public class Book {
	private String name;
	private String author;
	private int publishingYear;

	public Book(String name, String author, int publishingYear) {
		this.name = name;
		this.author = author;
		this.publishingYear = publishingYear;
	}

	public Book() {

	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

}
