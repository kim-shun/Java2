package example;

public class OrverLoadSample {

	public static void main(String[] args) {
		Cat tama = new Cat();
		tama.setName("タマ");
		tama.setAge(3);
		
		tama.eat();
		tama.eat("贅沢なキャットフード");
		
		tama.playToy("ボール");
		tama.playToy();

	}

}
