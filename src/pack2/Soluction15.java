package pack2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Question : Jaden Casing Strings
 * Writer : Kyudong
 * Date : 2022-10-10
 * Time : 오전 1:38
 */
public class Soluction15 {

	public static void main(String[] args) {
		System.out.println(toJadenCase("most trees are blue"));
		System.out.println(toJadenCase(null));
		System.out.println(toJadenCase(""));
	}

	/**
	 * 첫 글자를 모두 대문자로 변환한다.
	 *
	 * @param phrase 문장
	 * @return 첫글자를 대문자로 변환한 문장
	 */
	static String toJadenCase(String phrase) {
		if (phrase == null || phrase.isEmpty()) {
			return null;
		}

		List<String> list = new ArrayList<>();
		for (String str : phrase.split("\\s")) {
			String upperStr = str.replace(String.valueOf(str.charAt(0)), String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT));
			list.add(upperStr);
		}

		return list.toString().replaceAll("[,\\[\\]]", "");
	}

}
