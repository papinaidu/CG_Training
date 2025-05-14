class Book{
	private final int ISBN;
	private String title;
 	private String author;
	static String libraryName = "Gov of India Library";
	Book(int ISBN, String title, String author){
		this.ISBN = ISBN;
		this.title=title;
		this.author = author;
	}
	void displayDetails() {
        	System.out.println("ISBN : " + ISBN);
        	System.out.println("title: " + title);
        	System.out.println("author: " + author);
   	}
	void displayLibraryName(){
		System.out.println("Library Name: " + libraryName);
	}
	
}
public class staticBookMain {
	public static void main(String[] args){
		Book obj = new Book(23489, "Hello World", "Ranveer");
		Book obj1 = new Book(23434, "human habits", "Peter");
		if (obj instanceof Book) {
            		System.out.println("obj is Instance of Book");
        	}
		obj.displayDetails();
		obj.displayLibraryName();
		obj1.displayDetails();
		obj1.displayLibraryName();
	}
}