package utils;

public class Main {

	public static void main(String[] args) {
		System.out.println(MyStringUtils.isNullOrEmpty(null));
		System.out.println(MyStringUtils.isNullOrEmpty(""));
		System.out.println(MyStringUtils.isNullOrEmpty(" "));
		System.out.println(MyStringUtils.isNullOrEmpty("null"));
	}

}
