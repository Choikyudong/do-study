package pack3;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Question : Convert string to camel case
 * Writer : Kyudong
 * Date : 2022-11-21
 * Time : 오후 10:48
 */
public class Soluction12 {

	public static void main(String[] args) {
		System.out.println(toCamelCase("the_Stealth_Warrior"));
		System.out.println(toCamelCase("the-stealth-Warrior"));
	}

	/**
	 * 주어진 문자열 s에서 -(dash), _(underscore)를 제거하고 카멜케이스 형태로 변환한다.
	 *
	 * 예시)
	 * "the-stealth-warrior" -> "theStealthWarrior"
	 * "The_Stealth_Warrior" -> "TheStealthWarrior"
	 *
	 * @param s 문자열
	 * @return 완성문자열
	 */
//	static String toCamelCase(String s){
//		String[] arr = s.split("[-_]");
//		StringBuilder sb = new StringBuilder(arr[0]);
//		for (int i = 1; i < arr.length; i++) {
//			sb.append(String.valueOf(arr[i].charAt(0)).toUpperCase(Locale.ROOT)).append(arr[i].substring(1));
//		}
//		return sb.toString();
//	}

	/**
	 * 주어진 문자열 s에서 -(dash), _(underscore)를 제거하고 카멜케이스 형태로 변환한다.
	 *
	 * @param s 문자열
	 * @return 완성문자열
	 */
	static String toCamelCase(String s){
		String[] arr = s.split("[-_]");
		return Arrays.stream(arr).skip(1)
				.map(str -> str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1))
				.collect(Collectors.joining("", arr[0], ""));
	}

}
