package codewar.pack1;

/**
 * Question : Reversed Strings
 * Writer : Kyudong
 * Date : 2022-09-20
 * Time : 오후 11:09
 */
public class Soluction23 {

	public static void main(String[] args) {
		System.out.println(solution("world"));
	}

	/**
	 * 주어진 문자열을 뒤짚어서 반환한다.
	 *
	 * @param str 문자열
	 * @return String 뒤짚은 문자열
	 */
//	public static String solution(String str) {
//		String result = "";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			result += String.valueOf(str.charAt(i));
//		}
//		return result;
//	}

	/**
	 * StringBuffer, Builder 이용
	 * 
	 * @param str 문자열
	 * @return String 뒤짚은 문자열
	 */
	public static String solution(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
