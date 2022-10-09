package pack2;

import java.util.Arrays;
import java.util.Locale;

/**
 * Question : Exes and Ohs
 * Writer : Kyudong
 * Date : 2022-10-10
 * Time : 오전 1:15
 */
public class Soluction14 {

	public static void main(String[] args) {
		System.out.println(getXO("xxxooo"));
		System.out.println(getXO("xxxXooOo"));
		System.out.println(getXO("xxx23424esdsfvxXXOOooo"));
		System.out.println(getXO("xXxxoewrcoOoo"));
		System.out.println(getXO("XxxxooO"));
		System.out.println(getXO("zssddd"));
		System.out.println(getXO("Xxxxertr34"));
	}

	/**
	 * x, o의 갯수가 일치하는지 확인한다.
	 *
	 * str에는 x, o이외의 문자가 들어올 수 있다.
	 *
	 * @param str 문자열
	 * @return 일치한다면 true를 반환한다.
	 */
	public static boolean getXO (String str) {
		var countX = Arrays.stream(str.split(""))
				.filter(s -> s.equalsIgnoreCase("x")).count();
		var countO = Arrays.stream(str.split(""))
				.filter(s -> s.equalsIgnoreCase("o")).count();
		return countX == countO;
	}

}
