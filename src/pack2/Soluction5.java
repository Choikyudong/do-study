package pack2;

import java.util.Arrays;

/**
 * Question : Reverse words
 * Writer : Kyudong
 * Date : 2022-10-03
 * Time : 오전 2:57
 */
public class Soluction5 {

	public static void main(String[] args) {
		System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
		System.out.println(reverseWords("apple"));
		System.out.println(reverseWords("a b c d"));
		System.out.println(reverseWords("double  spaced  words"));
		System.out.println(reverseWords("   "));
	}

	/**
	 * 주어진 문자를 반대로 반환한다.
	 *
	 * 예시)
	 * "This is an example!" ==> "sihT si na !elpmaxe"
	 * "double  spaces"      ==> "elbuod  secaps"
	 *
	 * @param original 문자열
	 * @return 반환된 문자열
	 */
	public static String reverseWords(final String original) {
		String[] arr = original.split("\\s");
		if (arr.length == 0) {
			return original;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new StringBuilder(arr[i]).reverse().toString();
		}
		return String.join(" ", arr);
	}

}
