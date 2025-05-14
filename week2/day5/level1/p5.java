class Books {
   String title;
   int publicationYear;
   Books(String title, int publicationYear){
       this.title = title;
       this.publicationYear = publicationYear;
   }
   void displayInfo(){
       System.out.println("title " + title);
       System.out.println("publicationYear " + publicationYear);
   }
}
class Author extends Books{
   String name;
   String bio;
   Author(String title, int publicationYear, String name, String bio){
       super(title, publicationYear);
       this.name = name;
       this.bio = bio;
   }
   void displayInfo(){
       super.displayInfo();
       System.out.println("Author name " + name);
       System.out.println("Author bio " + bio);
   }
}

public class Main {
   public static void main(String[] args) {
       Books b = new  Books("Book ", 2018);
       Author a = new Author( "Book", 2018, "John", "Author since 1990");
       a.displayInfo();
   }
}