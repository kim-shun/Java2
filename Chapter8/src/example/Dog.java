package example;

public class Dog extends Animal {
	public Dog(String name, int age) {
		setName(name);
		setAge(age);
		System.out.println(name + "," + age);
	}
	
	public void eat() {
		eat("ご飯");
	}
	
	public void eat(String food) {
		printMessage(food + "を食べるよ！美味しいワン");
		printMessage("お腹が一杯になったワン");
		setHungry(false);
	}
	
	public void playToy(String toy) {
		printMessage(toy + "で遊ぶよ。楽しいワン");
		printMessage("遊んでお腹が減ったワン");
		setHungry(true);
	}
	
	public void playToy() {
		playToy("おもちゃ");
	}
}
