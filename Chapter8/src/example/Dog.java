package example;

public class Dog extends Animal implements Pet {
	public Dog(String name, int age) {
//		setName(name);
//		setAge(age);
		super(name,age);
		System.out.println(name + "," + age);
	}
	
	@Override
	public void eat() {
		eat("ご飯");
	}
	
	@Override
	public void eat(String food) {
		printMessage(food + "を食べるよ！美味しいワン");
		printMessage("お腹が一杯になったワン");
		setHungry(false);
	}
	
	@Override
	public void playToy(String toy) {
		printMessage(toy + "で遊ぶよ。楽しいワン");
		printMessage("遊んでお腹が減ったワン");
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
			printMessage("お腹が空いてるワン");
		} else {
			printMessage("お腹は空いてないワン");
		}
	}
}
