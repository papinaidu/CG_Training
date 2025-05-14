class MovieNode{
   MovieNode previous;
   MovieNode next;
   String MovieTitle;
   String Director;
   int YearOfRelease;
   double Rating;
   MovieNode(String MovieTitle, String Director, int YearOfRelease, double Rating){
       this.MovieTitle = MovieTitle;
       this.Director = Director;
       this.YearOfRelease = YearOfRelease;
       this.Rating = Rating;
       this.previous = null;
       this.next = null;
   }
}
class MovieLinkedList{
   MovieNode head;
   void addNodeAtEnd(String MovieTitle, String Director, int YearOfRelease, double Rating){
       MovieNode node = new MovieNode(MovieTitle, Director, YearOfRelease, Rating);
       if(head== null){
           head = node;
           return;
       }

       MovieNode current = head;
       while(current.next != null){
           current = current.next;
       }
       current.next = node;
       node.previous = current;

   }
   void AddNodeAtPosition(String MovieTitle, String Director, int YearOfRelease, double Rating, int position){
       MovieNode node = new MovieNode(MovieTitle, Director, YearOfRelease, Rating);
       if(position < 1){
           System.out.print("Invalid Position");
       }
       if (head == null) {
           if (position != 1) {
               System.out.println("Invalid position in empty list");
               return;
           }
           head = node;
           return;
       }

       if (position == 1) {
           node.next = head;
           head.previous = node;
           head = node;
           return;
       }
       MovieNode current = head;
       int count = 1;
       while(current.next != null && count < position-1){
           current = current.next;
           count++;
       }


       node.next = current.next;
       node.previous = current;
       if (current.next != null) {
           current.next.previous = node;
       }
       current.next = node;
   }
   void addNodeAtBeginning(String MovieTitle, String Director, int YearOfRelease, double Rating){
       MovieNode node = new MovieNode(MovieTitle, Director, YearOfRelease, Rating);
       if(head == null){
           head = node ;
           return;
       }

       node.next = head;
       head.previous = node;
       head = node;
   }
   void deleteNodeByValue(String Director){
       if(head == null){
           return;
       }
       if(Director.equals(head.Director)){
           head = head.next;
           return;
       }
       MovieNode current = head;
       while(current!= null && !Director.equals(current.Director)){
           current = current.next;
       }
       if (current == null) return;

       if (current.previous != null)
           current.previous.next = current.next;

       if (current.next != null)
           current.next.previous = current.previous;
   }
   void display(){
       MovieNode current = head;
       while(current != null){
           Printout(current);
           current = current.next;
       }
       System.out.println();

   }
   void searchByMovieTitle(String MovieTitle){
       MovieNode current = head;
       if(head == null){
           return;
       }
       while(current != null && !MovieTitle.equals(current.MovieTitle)){
           current = current.next;
       }
       if (current == null) return;
       Printout(current);
   }

   void searchByRating(double Rating){
       MovieNode current = head;
       if(head == null){
           return;
       }
       if(head.Rating == Rating){
           Printout(head);
       }
       while(current != null && current.Rating == Rating){
           current = current.next;
       }
       if (current == null) return;
       Printout(current);
   }

   void Printout(MovieNode movie){
       System.out.print(movie.MovieTitle + " -> ");
       System.out.print(movie.Director + " -> ");
       System.out.print(movie.YearOfRelease + " -> ");
       System.out.print(movie.Rating + " -> ");
       System.out.print( "Null");
       System.out.println();
   }
}
public class Main  {
   public static void main(String[] args) {
       MovieLinkedList list = new MovieLinkedList();
       list.addNodeAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
       list.addNodeAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
       list.addNodeAtEnd("The Dark Knight", "Christopher Nolan", 2008, 9.0);


       System.out.println("Initial List:");
       list.display();

       list.addNodeAtBeginning("Memento", "Christopher Nolan", 2000, 8.4);
       System.out.println("\nAfter adding at beginning:");
       list.display();


       list.AddNodeAtPosition("Tenet", "Christopher Nolan", 2020, 7.4, 3);
       System.out.println("\nAfter adding at position 3:");
       list.display();


       System.out.println("\nSearching for 'Inception':");
       list.searchByMovieTitle("Inception");


       System.out.println("\nSearching for movies with rating 8.6:");
       list.searchByRating(8.6);


       list.deleteNodeByValue("Christopher Nolan");
       System.out.println("\nAfter deleting first movie directed by 'Christopher Nolan':");
       list.display();

   }
}