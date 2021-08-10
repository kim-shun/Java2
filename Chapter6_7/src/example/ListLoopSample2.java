package example;

import java.util.ArrayList;
import java.util.List;

public class ListLoopSample2 {

	public static void main(String[] args) {
		List<Pet> petList = new ArrayList<>();
		Pet tama = new Cat();
		Pet pochi = new Dog();
		
		petList.add(tama);
		petList.add(pochi);
		
//		Pet pet1 = petList.get(0);
//		Pet pet2 = petList.get(1);
		
//		pet1.eat();
//		pet1.playToy();
//		pet2.eat();
		
		for (Pet pet : petList ) {
			pet.eat();
			pet.playToy();
		}

	}

}
