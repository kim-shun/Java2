package example;

public class UseCatSample {

	public static void main(String[] args) {
		Cat tama = new Cat();
		tama.eat();
		tama.playToy("ひも");

		boolean h = tama.isHungry();
		if (h == true) {
			System.out.println("お腹が空いてるにゃー");
		} else {
			System.out.println("お腹は空いてないにゃー");
		}
	}

}
