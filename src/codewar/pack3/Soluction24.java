package codewar.pack3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Question : Highest Scoring Word
 * Writer : Kyudong
 * Date : 2022-12-10
 * Time : PM 4:48
 */
public class Soluction24 {

	public static void main(String[] args) {
		System.out.println(high("man i need a taxi up to ubud"));
		System.out.println(high("what time are we climbing up to the volcano"));
		System.out.println(high("take me to semynak"));
		System.out.println(high("aa b"));
		System.out.println(high("b aa"));
		System.out.println(high("bb d"));
		System.out.println(high("d bb"));
		System.out.println(high("aaa b"));
	}

	/**
	 * 문장에서 각 문자의 합을 더해서 가장 큰 문자열을 반환한다.
	 *
	 * 합을 더할 때는 아래의 공식을 따른다.
	 * a = 1, b = 2, c = 3...
	 * 
	 * @param s 문자열
	 * @return 가장 큰 문자열
	 */
//	public static String high(String s) {
//		String[] arr = s.split("\\s");
//
//		String highsetWord = "";
//		int sum = 0;
//		for (var word : arr) {
//			int sumWord = 0;
//			char[] temp = word.toCharArray();
//			for (var c : temp) {
//				sumWord += (int) c - 96;
//			}
//			if (sumWord > sum) {
//				highsetWord = word;
//				sum = sumWord;
//			}
//		}
//
//		return highsetWord;
//	}

	/**
	 * 스트림 예시를 따라해봄
	 *
	 * @param s 문자열
	 * @return 가장 큰 문자열
	 */
	public static String high(String s) {
		return Arrays.stream(s.split("\\s"))
				.max(Comparator.comparingInt(str -> str.chars().map(c -> c - 96).sum())).get();
	}

}
