import java.util.Scanner;
class book{
	String title;
	String author;
	int price;
	book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void display(){
		System.out.println("Title of the book: " + title);
		System.out.println("author of the book: " + author);
		System.out.println("price of the book: " + price);
	}
}
public class bookMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title: ");
		String title = sc.nextLine();
		System.out.println("Enter the author name: ");
		String author = sc.next();
		System.out.println("Enter the price: ");
		int price = sc.nextInt();
		book obj = new book(title, author, price);
		obj.display();
	}
}