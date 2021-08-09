package example;

import java.util.Scanner;

public class PolymorphismSample {

	public static void main(String[] args) {
		Pet pet;
		
		System.out.println("触れ合いたいペットを選んでください");
		System.out.println("  1:猫、2:犬 (1 or 2 どちらかを入力してEnter):");
		
		Scanner keyInput = new Scanner(System.in);
		String inputStr = keyInput.nextLine();
		
		if (inputStr.equals("1")) {
			pet = new Cat();
			System.out.println("＜猫が選択されました＞");
		} else if (inputStr.equals("2")) {
			pet = new Dog();
			System.out.println("＜犬が選択されました＞");
		} else {
			pet = new Cat();
			System.out.println("＜1,2以外が入力されたので、猫(デフォルト)を選択します＞");
		}

	}

}
