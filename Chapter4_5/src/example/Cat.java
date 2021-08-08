package example;

public class Cat {
	String name;
	int age;
	boolean hungry;
	
	void eat() {
		System.out.println(name + ">" + "ご飯を食べるよ！おいしいにゃー");
		System.out.println(name + "> お腹が一杯になったにゃー");
		hungry = false;
	}
	
	boolean isHungry() {
		return true;
	}
	
	void playToy(String toy) {
		System.out.println(name + ">" + toy + "で遊ぶよ。楽しいにゃー");
		System.out.println(name + "> 遊んでお腹が減ったにゃー");
		hungry = true;
	}
	
	void setName(String catName) {
		name = catName;
	}
	
	String getName() {
		return name;
	}
	
	void setAge(int catAge) {
		age = catAge;
	}
	
	int getAge() {
		return age;
	}

}
