package codewar.pack2;

/**
 * Question : String ends with?
 * Writer : Kyudong
 * Date : 2022-10-17
 * Time : 오후 11:48
 */
public class Soluction21 {

	public static void main(String[] args) {
		System.out.println(solution("samurai", "ai"));
		System.out.println(solution("sumo", "omo"));
		System.out.println(solution("ninja", "ja"));
		System.out.println(solution("sensei", "i"));
		System.out.println(solution("samurai", "ra"));
		System.out.println(solution("abc", "abcd"));
		System.out.println(solution("abc", "abc"));
		System.out.println(solution("abcabc", "bc"));
		System.out.println(solution("ails", "fails"));
		System.out.println(solution("fails", "ails"));
		System.out.println(solution("this", "fails"));
		System.out.println(solution("this", ""));
		System.out.println(solution(":-)", ":-("));
		System.out.println(solution("!@#$%^&*() :-)", ":-)"));
		System.out.println(solution("abc\n", "abc"));
	}

	/**
	 * 주어진 문자(str)의 끝이 해당 문자(ending)으로 되는지 확인한다.
	 *
	 * @param str 문자열
	 * @param ending 마지막 단어 또는 문자
	 * @return true일 경우 ending으로 끝나는 문자란 말임
	 */
//	public static boolean solution(String str, String ending) {
//		return str.endsWith(ending);
//	}

	/**
	 * 쉽고 재밌게 푼 답안을 가져와봄
	 *
	 * @param str 문자열
	 * @param ending 마지막 단어 또는 문자
	 * @return true일 경우 ending으로 끝나는 문자란 말임
	 */
	public static boolean solution(String str, String ending) {
		return str.length() >= ending.length() && str.substring(str.length() - ending.length()).equals(ending);
	}

}
