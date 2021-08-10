package example;

public class Cat extends Animal {
	public Cat(String name, int age) {
		setName(name);
		setAge(age);
		System.out.println(name + "," + age);
	}
		
	public void eat() {
		eat("ご飯");
	}
	
	public void eat(String food) {
		printMessage(food + "を食べるよ！美味しいにゃー");
		printMessage("お腹が一杯になったにゃー");
		setHungry(false);
	}
	
	public void playToy(String toy) {
		printMessage(toy + "で遊ぶよ。楽しいにゃー");
		printMessage("遊んでお腹が一杯になったにゃー");
		setHungry(true);
	}
	
	public void playToy() {
		playToy("おもちゃ");
	}
		
		
	
}
