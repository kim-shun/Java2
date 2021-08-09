package example;

public class Cat {
	private String name;
	private int age;
	private boolean hungry;
	
	public Cat() {
		this.name = "まだない";
		this.age = 0;
	}
	
	private void printMessage(String message) {
		System.out.println(name + "> " + message);
	}
	
	public void eat() {
		printMessage("ご飯を食べるよ！おいしいにゃー");
		printMessage("お腹が一杯になったにゃー");
		hungry = false;
	}
	
	public void eat(String food) {
		printMessage(food + "を食べるよ！美味しいにゃー");
		printMessage("お腹が一杯になったにゃー");
		hungry = false;
	}
	
	public boolean isHungry() {
		return true;
	}
	
	public void playToy(String toy) {
		printMessage(toy + "で遊ぶよ。楽しいにゃー");
		printMessage("遊んでお腹が減ったにゃー");
		hungry = true;
	}
	
	public void playToy() {
		printMessage("おもちゃで遊ぶよ。楽しいにゃー");
		printMessage("遊んでお腹が空いたにゃー");
		hungry = true;
	}
	
	public void setName(String catName) {
		name = catName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int catAge) {
		age = catAge;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
	public void introduceMyself() {
		printMessage("名前は" + getName() + "です、" + getAge() + "歳です。");
	}

}
