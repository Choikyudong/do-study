package codewar.pack2;


/**
 * Question : Disemvowel Trolls
 * Writer : Kyudong
 * Date : 2022-10-03
 * Time : 오후 9:00
 */
public class Soluction6 {

	public static void main(String[] args) {
		System.out.println(disemvowel("This website is for losers LOL!"));
		System.out.println(disemvowel("No offense but,\nYour writing is among the worst I've ever read"));
		System.out.println(disemvowel("What are you, a communist?"));
	}

	/**
	 * 모음을 모두 제거하고 반환한다.
	 *
	 * (?i)를 이용하면 대소문자를 구분을 하지 않는다.
	 *
	 * @param str 문자열
	 * @return 특정 문자가 제거된 문자열
	 */
	public static String disemvowel(String str) {
		return str.replaceAll("(?i)[aeiou]", "");
	}

}
