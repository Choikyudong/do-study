package codewar.pack1;

import java.util.Locale;

/**
 * Question : Abbreviate a Two Word Name
 * Writer : Kyudong
 * Date : 2022-09-19
 * Time : 오후 11:45
 */
public class Soluction22 {

	public static void main(String[] args) {
		System.out.println(abbrevName("Sam Harris"));
		System.out.println(abbrevName("Patrick Feenan"));
		System.out.println(abbrevName("Evan Cole"));
		System.out.println(abbrevName("P Favuzzi"));
		System.out.println(abbrevName("David Mendieta"));
	}

	/**
	 * Sam Harris => S.H 식으로 글자를 던져준다.
	 *
	 * @param name 영어 이름
	 * @return 글자를 던져줌
	 */
	public static String abbrevName(String name) {
		String[] arr = name.split(" ");
		return (arr[0].charAt(0) + "." + arr[1].charAt(0)).toUpperCase(Locale.ROOT);
	}

}
