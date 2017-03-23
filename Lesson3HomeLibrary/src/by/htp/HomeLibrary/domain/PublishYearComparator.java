package by.htp.HomeLibrary.domain;

import java.util.Comparator;

public class PublishYearComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getPublishingYear()>o2.getPublishingYear()){
			return 1;
		}
		else if(o1.getPublishingYear()<o2.getPublishingYear()){
			return -1;
		}
		return 0;
	}

}
