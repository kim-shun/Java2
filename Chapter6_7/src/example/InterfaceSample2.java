package example;

public class InterfaceSample2 {

	public static void main(String[] args) {
		Pet pet = new Cat();
		pet.eat();
		
		pet = new Dog();
		pet.eat();

	}

}
