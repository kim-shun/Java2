package example;

public class Cat extends Animal implements Pet {
	public Cat(String name, int age) {
		setName(name);
		setAge(age);
		System.out.println(name + "," + age);
	}
		
	@Override
	public void eat() {
		eat("ご飯");
	}
	
	@Override
	public void eat(String food) {
		printMessage(food + "を食べるよ！美味しいにゃー");
		printMessage("お腹が一杯になったにゃー");
		setHungry(false);
	}
	
	@Override
	public void playToy(String toy) {
		printMessage(toy + "で遊ぶよ。楽しいにゃー");
		printMessage("遊んでお腹が一杯になったにゃー");
		setHungry(true);
	}
	
	@Override
	public void playToy() {
		playToy("おもちゃ");
	}
	
	@Override
	public void introduceMyself() {
//		printMessage("名前は" + getName() + "です、" + getAge() + "歳です。");
		super.introduceMyself();
		
		boolean h = isHungry();
		if (h == true) {
			printMessage("お腹が空いてるにゃー");
		} else {
			printMessage("お腹は空いてないにゃー");
		}
	}
		
		
	
}
