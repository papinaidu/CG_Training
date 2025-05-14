import java.util.Scanner;
class Item{
	int itemcode;
	String itemName;
	int price;
	Item(int itemcode, String itemName,int price){
		this.itemcode = itemcode;
		this.itemName = itemName;
		this.price = price;
	}
	int totalCost(int price, int quantity){
		if(quantity>0){
			return price * quantity;
		}
		else{
			return price;
		}
	}

	void display(){
		System.out.println("Item code: " + itemcode);
		System.out.println("Item Name: " + itemName);
		System.out.println("Item price: " + price);
		

	}
	
}

public class ItemMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter itemcode: ");
		int itemcode = sc.nextInt();
		System.out.println("Enter itemName: ");
		String itemName = sc.next();
		System.out.println("Enter price: ");
		int price = sc.nextInt();
		Item obj = new Item(itemcode, itemName, price);
		System.out.println("Enter quantity: ");
		int quantity = sc.nextInt();
		obj.display();
		System.out.println("Total Cost: " + obj.totalCost(price, quantity));
	}
}