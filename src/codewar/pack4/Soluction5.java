package codewar.pack4;

import java.util.regex.*;

/**
 * Question : String incrementer
 * Writer : Kyudong
 * Date : 2023-01-03
 * Time : 오후 9:54
 */
public class Soluction5 {

	public static void main(String[] args) {
		System.out.println(incrementString("foobar000"));
		System.out.println(incrementString("foo"));
		System.out.println(incrementString("foobar001"));
		System.out.println(incrementString("foobar99"));
		System.out.println(incrementString("foobar099"));
		System.out.println(incrementString(""));
		System.out.println(incrementString("99obar99"));
		System.out.println(incrementString("?zyG8'1`00000000000003442"));
	}

	/**
	 * 숫자가 포함된 문자열이 제공되는데 숫자에 + 1을 더한다.
	 * 어려워서 사람들 풀이 봄;; 정규식~
	 * @param str 문자열
	 * @return 문자열
	 */
	public static String incrementString(String str) {
		Pattern pattern = Pattern.compile("\\d{1,5}$");
		Matcher matcher = pattern.matcher(str);
		return matcher.find() ? str.replaceAll("\\d{1,5}$",
				String.format("%0" + matcher.group().length() + "d", Integer.parseInt(matcher.group()) + 1)) :
				str + 1;
	}

}
