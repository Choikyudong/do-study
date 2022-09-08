package pack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Question : ReverseWords
 * Writer : Kyudong
 * Date : 2022-09-09
 * Time : 오전 12:55
 */
public class Day4 {

	public static void main(String[] args) {
		Day4.reverseWords("I like eating");
		Day4.reverseWords("I like flying");
		Day4.reverseWords("The world is nice");
	}

	/**
	 * 주어진 영문장을 역순으로 반환한다.
	 * 
	 * @param str 주어진 영문장
	 * @return String 역순으로 만든 영문장
	 */
	public static String reverseWords(String str){
		String[] words = str.split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = words.length; i > 0; i--) {
			sb.append(words[i - 1]);
			if (i != 1) {
				sb.append(" ");
			}
		}

		return sb.toString();
	}


	/**
	 * 같은 문제를 정규표현식으로 풀어봄
	 *
	 * @param str 주어진 영문장
	 * @return String 역순으로 만든 영문장
	 */
//	public static String reverseWords(String str) {
//		List<String> words = Arrays.asList(str.split(" "));
//		Collections.reverse(words);
//		String regex = "[\\[\\],]";
//		return words.toString().replaceAll(regex, "");
//	}

}
