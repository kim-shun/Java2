package example;

public class StringSample {

	public static void main(String[] args) {
		String str1 = "123";
		System.out.println(str1.length());
		
		String str3 = "ABCdef";
		System.out.println(str3.toLowerCase());
		
		String str4 = "ABCdef123ＡＢＣｄｅｆ";
		System.out.println(str4.toUpperCase());
		
		String str5 = "abcdefghij";
		String str6 = "abc";
		System.out.println(str5.indexOf(str6));
		
		String str7 = "efg";
		String str8 = "1234";
		
		System.out.println(str5.indexOf(str7));
		System.out.println(str5.indexOf(str8));
	}

}
