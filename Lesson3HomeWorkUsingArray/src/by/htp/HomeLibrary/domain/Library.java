package by.htp.HomeLibrary.domain;

public class Library {

	public Library(Book[] bookArray) {
		// TODO Auto-generated constructor stub
	}

	public void showLibrary(Book[] bookArray) {
		for (Book e : bookArray) {
			System.out.println(
					"Book: " + e.getName() + " by author: " + e.getAuthor() + " year: " + e.getPublishingYear());
		}
	}

	public Book[] addBookToLibrary(Book[] bookArray, String bookName, String bookAuthor, int bookYear) {
		int maxElement = 0;
		int i = 0;
		int lenght = bookArray.length;
		for (i = 0; i < lenght; i++) {
			if (bookArray[i] == null) {
				maxElement = i - 1;
			} else {
				maxElement = i;
			}
		}

		if (maxElement == bookArray.length - 1) {
			Book bookArray2[] = new Book[i + 1];
			bookArray2[i] = new Book(bookName, bookAuthor, bookYear);
			System.arraycopy(bookArray, 0, bookArray2, 0, bookArray.length);
			bookArray = bookArray2;
		}
		return bookArray;
	}

	public Book[] dellBookFromLibrary(Book[] bookArray, String bookName) {
		int foundIndex = 0;
		for (Book e : bookArray) {
			if (e.getName() != bookName) {
				foundIndex = foundIndex + 1;
			} else {
				break;
			}
		}
		for (int i = foundIndex + 1; i < bookArray.length; i++) {
			bookArray[i - 1] = bookArray[i];
		}
		Book bookArrayDel[] = new Book[bookArray.length - 1];
		System.arraycopy(bookArray, 0, bookArrayDel, 0, bookArray.length - 1);
		bookArray = bookArrayDel;

		return bookArray;
	}

	public Book[] findBookByAuthor(Book[] bookArray, String stringWithAutors) {
		//Book bookArrayFound[] = new Book[1];
		String[] authors = stringWithAutors.split(",");
		for (Book e : bookArray) {
			String bookAuthor = e.getAuthor();
			for (String h : authors) {
				if (h.contains(bookAuthor)) {
					System.out.println("Fond Book: " + e.getName() + " with autor " + e.getAuthor() + " year "
							+ e.getPublishingYear());
				}
			}
		}
		return bookArray;
	}
	public Book[] sortByYear(Book[] bookArray){
		for (int i = bookArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (bookArray[j].getPublishingYear() > bookArray[j + 1].getPublishingYear()) {
                    Book t = bookArray[j];
                    bookArray[j] = bookArray[j + 1];
                    bookArray[j + 1] = t;
                }
            }
        }
		return bookArray;
	}
}
