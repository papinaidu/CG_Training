import java.util.Scanner;
class MobilePhone{
	String brand;
	String model;
	int price;
	MobilePhone(String brand, String model,int price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	

	void display(){
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
		

	}
	
}

public class MobilePhoneMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Brand: ");
		String brand = sc.next();
		System.out.println("Enter Model: ");
		String model = sc.next();
		System.out.println("Enter Price: ");
		int price = sc.nextInt();
		MobilePhone obj = new MobilePhone(brand, model, price);
		obj.display();		
	}
}