package example;

public class WrapperClassSample {

	public static void main(String[] args) {
		String str1 = "123";
		int i1 = Integer.parseInt(str1);
		System.out.println(i1);
		String str2 = "-123";
		System.out.println(Integer.parseInt(str2));
		String str3 = "+123";
		System.out.println(Integer.parseInt(str3));
		String str6 = "10.5";
//		System.out.println(Integer.parseInt(str6));
		System.out.println(Double.parseDouble(str6));

	}

}
