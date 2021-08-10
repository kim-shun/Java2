package example;

public class ExtendsAndImplementsSample {

	public static void main(String[] args) {
		Pet tama = new Cat("タマ", 3);
		
		tama.eat();
		tama.introduceMyself();
		tama.setAge(4);
		tama.introduceMyself();
		
		Pet pochi = new Dog("ぽち", 5);
		
		pochi.eat();
		pochi.introduceMyself();

	}

}
