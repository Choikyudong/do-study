package codewar.pack2;

/**
 * Question : Credit Card Mask
 * Writer : Kyudong
 * Date : 2022-10-16
 * Time : 오후 10:18
 */
public class Soluction19 {

	public static void main(String[] args) {
		System.out.println(maskify("4556364607935616"));
		System.out.println(maskify("64607935616"));
		System.out.println(maskify("1"));
		System.out.println(maskify(""));
		System.out.println(maskify("Skippy"));
		System.out.println(maskify("Nananananananananananananananana Batman!"));
	}

	/**
	 * 전달받은 문자열(str)의 끝에서부터 4글자를 제외하고 #으로 변환한다.
	 *
	 * @param str 문자열
	 * @return 변환된 문자열
	 */
//	public static String maskify(String str) {
//		if (5 > str.length()) {
//			return str;
//		}
//		String lastWord = str.substring(str.length() - 4);
//		String changeWord = str.substring(0, str.length() - 4).replaceAll(".", "#");
//		return changeWord.concat(lastWord);
//	}

	/**
	 * 정규식을 잘 썼길래 가져와봄
	 *
	 * @param str 문자열
	 * @return 변환된 문자열
	 */
	public static String maskify(String str) {
		if (str == null) {
			throw new NullPointerException("wtf");
		}
		return str.replaceAll(".(?=.{4})", "#");
	}

}
