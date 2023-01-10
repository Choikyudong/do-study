package codewar.pack2;

import java.util.Locale;

/**
 * Question : Isograms
 * Writer : Kyudong
 * Date : 2022-10-10
 * Time : 오전 12:06
 */
public class Soluction13 {

	public static void main(String[] args) {
		System.out.println(isIsogram("Dermatoglyphics"));
		System.out.println(isIsogram("isogram"));
		System.out.println(isIsogram("moose"));
		System.out.println(isIsogram("isIsogram"));
		System.out.println(isIsogram("aba"));
		System.out.println(isIsogram("moOse"));
		System.out.println(isIsogram("thumbscrewjapingly"));
		System.out.println(isIsogram(""));
	}

	/**
	 * 주어진 문자에 반복되는 단어가 있는지 확인하고 여부를 반환한다.
	 *
	 * @param str 문자열
	 * @return true면 반복되는 단어가 없다는 뜻
	 */
//	public static boolean isIsogram(String str) {
//		String[] arr = str.split("");
//		for (var outStr : arr) {
//			int count = 0;
//			for (var inStr : arr) {
//				if (outStr.equalsIgnoreCase(inStr)) {
//					count++;
//				}
//			}
//			if (count > 1) {
//				return false;
//			}
//		}
//		return true;
//	}

	/**
	 * 주어진 문자에 반복되는 단어가 있는지 확인하고 여부를 반환한다.
	 *
	 * intstream으로 변환함으로써 공백값을 제대로 확인할 수 있다.
	 *
	 * @param str 문자열
	 * @return true면 반복되는 단어가 없다는 뜻
	 */
	public static boolean isIsogram(String str) {
		return str.length() == str.toLowerCase(Locale.ROOT).chars().distinct().count();
	}

}
