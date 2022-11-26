package pack3;

import java.util.Arrays;

/**
 * Question : Split Strings
 * Writer : Kyudong
 * Date : 2022-11-27
 * Time : AM 1:01
 */
public class Soluction16 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("abcdef")));
		System.out.println(Arrays.toString(solution("HelloWorld")));
		System.out.println(Arrays.toString(solution("abcde")));
		System.out.println(Arrays.toString(solution("LovePizza")));
	}

	/**
	 * 주어진 문자열 s를 2문자씩 분리시키는데 문자가 하나일 경우 _를 더한다.
	 * <p>
	 * 예시)
	 * 'abc' =>  ['ab', 'c_']
	 * 'abcdef' => ['ab', 'cd', 'ef']
	 *
	 * @param s 문자열
	 * @return 예시를 통해서 완성된 String[]
	 */
//	public static String[] solution(String s) {
//		boolean isPair = s.length() % 2 == 0;
//
//		String[] result = isPair ? new String[s.length() / 2] : new String[s.length() / 2 + 1];
//
//		for (int i = 0, j = 0; i < result.length; i++, j++) {
//			if (!isPair && i == result.length - 1) {
//				break;
//			}
//			result[i] = s.substring(j, j++ + 2);
//		}
//
//		if (!isPair) {
//			result[result.length - 1] = s.charAt(s.length() - 1) + "_";
//		}
//
//		return result;
//	}

	/**
	 * 위에꺼 만들고 보니 너무 비효율적이라 변경해봄
	 *
	 * @param s 문자열
	 * @return 예시를 통해서 완성된 String[]
	 */
//	public static String[] solution(String s) {
//		s = s.length() % 2 == 0 ? s : s + "_";
//		String[] result = new String[s.length() / 2];
//		for (int i = 0, j = 0; i < result.length; i++, j++) {
//			result[i] = s.substring(j, j++ + 2);
//		}
//		return result;
//	}

	/**
	 * 원래 첨부터 정규식으로 하려고 했는디.. 정규식을 작성못해서 못함;
	 *
	 * @param s 문자열
	 * @return 예시를 통해서 완성된 String[]
	 */
	public static String[] solution(String s) {
		s = (s.length() % 2 == 0) ? s : s + "_";
		return s.split("(?<=\\G.{2})");
	}

}
