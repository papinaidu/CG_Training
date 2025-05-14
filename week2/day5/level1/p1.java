class Animal {
	String name;
	int age;
	void makeSound(){
		System.out.println("I am from Animal class");
	}
}
class Dog extends Animal{
	
	void makeSound(){
		System.out.println("I am from Dog class");	
	}
}
class Cat extends Animal{
	void makeSound(){
		System.out.println("I am from Cat class");
	}
}
class Bird extends Animal{
	void makeSound(){
		System.out.println("I am from Bird class");
	}
}

public class AnimalMain {
	public static void main(String[] args){
		Animal a = new Animal();
		Bird b = new Bird();
		Cat c = new Cat();
		Dog d = new Dog();
		d.makeSound();
		
	}
}