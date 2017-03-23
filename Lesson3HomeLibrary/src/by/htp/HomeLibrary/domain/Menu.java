package by.htp.HomeLibrary.domain;
import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	private String answer;
	public boolean wantAddNewBookOrNo(){
				answer=sc.nextLine();
				switch(answer){
					case "yes":return true;
					case "no":return false;
					default: {
						System.out.println("Available only yes/no answers");
						return false;
					}
				}
	}
	public String nameOfBook(){
		System.out.println("Please enter book name: ");
		answer=sc.nextLine();
		String name= answer;
		return name;
		}
	public String authorOfBook(){
		System.out.println("Please enter author: ");
		answer=sc.nextLine();
		String author= answer;
		return author;
	}
	public int yearOfBook(){
		System.out.println("Please enter publishing year: ");
		answer=sc.nextLine();
		int year = Integer.parseInt(answer);
		return year;
	}
	public String setNameElement(){
		System.out.println("Please enter name of delete element: ");
		answer=sc.nextLine();
		return answer;
	}
	public String findNameElement(){
		System.out.println("Please enter auhtor/authors(via comma) to find his book: ");
		answer=sc.nextLine();
		return answer;
	}
	
}
