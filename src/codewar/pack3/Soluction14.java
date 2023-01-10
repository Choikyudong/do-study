package codewar.pack3;

import java.util.Locale;

/**
 * Question : Detect Pangram
 * Writer : Kyudong
 * Date : 2022-11-23
 * Time : 오후 9:55
 */
public class Soluction14 {

	public static void main(String[] args) {
		System.out.println(check("The quick brown fox jumps over the lazy dog."));
		System.out.println(check("You shall not pass!"));
		System.out.println(check("ldbkrxc pumqyngtozv"));
	}

	/**
	 * 주어진 문자가 판그램인지 확인한다.
	 * 
	 * 판그램인란 알파벳의 모든 글자를 적어도 한 번은 포함하는 문장이다.
	 * 
	 * @param sentence 문자열
	 * @return true일 경우 판그램
	 */
//	static boolean check(String sentence){
//		char[] arr = sentence.replaceAll("[.\\s]", "").toLowerCase(Locale.ROOT).toCharArray();
//
//		boolean result = false;
//		for (int i = 97; i < 123; i++) {
//			result = false;
//			for (var word : arr) {
//				if (word == i) {
//					result = true;
//					break;
//				}
//			}
//			if (!result) {
//				break;
//			}
//		}
//
//		return result;
//	}

	/**
	 * 주어진 문자가 판그램인지 확인한다.
	 *
	 * for문을 활용하면 조금 더 쉽게 구현이 가능하다.
	 *
	 * @param sentence 문자열
	 * @return true일 경우 판그램
	 */
	static boolean check(String sentence){
		for (char c = 'a'; c <= 'z'; c++) {
			if (!sentence.toLowerCase(Locale.ROOT).contains(String.valueOf(c))) {
				return false;
			}
		}
		return true;
	}

}
