import java.util.Scanner;
public class  Amar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amar age: ");
		int a1 = sc.nextInt();
		System.out.println("Enter the Amar Height: ");
		int h1 = sc.nextInt();
		System.out.println("Enter the Akbar age: ");
		int a2 = sc.nextInt();
		System.out.println("Enter the Akbar Height: ");
		int h2 = sc.nextInt();
		System.out.println("Enter the Anthony age: ");
		int a3 = sc.nextInt();
		System.out.println("Enter the Anthony Height: ");
		int h3 = sc.nextInt();

		if(a1 <= a2 && a1 <= a3){
			System.out.println("Amar is Younger");
		}
		if (a2 <= a1 && a2 <= a3){
			System.out.println("Akbar is Younger");
		}
		if (a3 <= a1 && a3 <= a2){
			System.out.println("Anthony is Younger");
		}
		
		if(h1 >= h2 && a1 >= h3){
			System.out.println("Amar is Tallest");
		}
		if (h2 >= h1 && h2 >= h3){
			System.out.println("Akbar is Tallest");
		}
		if (h3 >= h1 && h3 >= h2){
			System.out.println("Anthony is Tallest");
		}
		
	}
}