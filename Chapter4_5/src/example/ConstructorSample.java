package example;

public class ConstructorSample {

	public static void main(String[] args) {
		Cat tama = new Cat();
		System.out.println();
		tama.introduceMyself();
		
		tama.setName("たま");
		tama.setAge(3);
		
		tama.introduceMyself();

	}

}
