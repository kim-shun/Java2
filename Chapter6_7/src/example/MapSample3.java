package example;

import java.util.HashMap;
import java.util.Map;

public class MapSample3 {

	public static void main(String[] args) {
		Map<String, Pet> petMap = new HashMap<>();
		
		Pet pet1 = new Cat();
		Pet pet2 = new Dog();
		
		petMap.put("佐藤さん", pet1);
		petMap.put("鈴木さん", pet2);
		petMap.put("田中さん", new Cat());
		
//		System.out.println("鈴木さんのペットにご飯をあげます");
//		Pet petOwnerdBySuzuki = petMap.get("鈴木さん");
//		petOwnerdBySuzuki.eat();
//		
//		Pet petOwnerdByTanaka = petMap.get("田中さん");
//		petOwnerdByTanaka.eat();
//		
//		Pet petOwnerdBySato = petMap.get("佐藤さん");
//		petOwnerdBySato.eat();
		
		for (String key : petMap.keySet()) {
			Pet petFromMap = petMap.get(key);
			petFromMap.eat();
		}

	}

}