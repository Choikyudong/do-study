package pack4;

import java.util.regex.Pattern;

/**
 * Question : Simple Pig Latin
 * Writer : Kyudong
 * Date : 2022-12-22
 * Time : 오후 10:28
 */
public class Soluction1 {

	public static void main(String[] args) {
		long start = System.nanoTime();

		System.out.println(pigIt("This is my string"));
		System.out.println(pigIt("Pig latin is cool"));
		System.out.println(pigIt("Hello world !"));

		long end = System.nanoTime();
		System.out.println(end - start);
	}

	/**
	 * 주어진 문장(str)에서 각 문자의 첫글자를 글자의 뒤로 보내고 ay를 붙인다.
	 * 단 구두점에는 ay를 붙이지 않는다.
	 *
	 * @param str String
	 * @return 조건에 맞춘 문자열~
	 */
//	public static String pigIt(String str) {
//		StringBuilder sb = new StringBuilder();
//
//		String[] strings = str.split("\\s");
//		for (var s : strings) {
//			int i = s.toLowerCase().charAt(0);
//			if (!(i > 96 && i < 123)) {
//				sb.append(s);
//			} else {
//				sb.append(s.substring(1));
//				sb.append((char) i).append("ay");
//			}
//			sb.append(" ");
//		}
//
//		return sb.toString().trim();
//	}

	/**
	 * 정규식을 이용해서 풀어보자.
	 *
	 * <pre>
	 * 해석을 하자면
	 * (\\w) : 글자의 묶음을 가르킴
	 * 예시)
	 * (\\w\\w) 2글자씩 묶어버리겠다는 말임
	 * (\\w)(\\w*) 글자하나와 '나머지'글자를 묶어버림
	 * 치환예시)
	 * $로 묶음을 다룰수 있음
	 * 여기서는 $2는 (\\w*)를 의미하고 $1는 (\\w)를 의미함
	 * </pre>
	 *
	 * @param str String
	 * @return 조건에 맞춘 문자열~
	 */
//	public static String pigIt(String str) {
//		return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
//	}

	/**
	 * 커밋하려니까 처음에 짠 로직과 정규식을 조금 섞어서 가능하지 않을까 싶어서..
	 * 근데 이게 더 느림 ㅋ
	 *
	 * @param str String
	 * @return 조건에 맞춘 문자열~
	 */
	public static String pigIt(String str) {
		StringBuilder sb = new StringBuilder();

		String[] strings = str.split("\\s");
		for (var s : strings) {
			String word = s.substring(0, 1);
			if (Pattern.matches("[a-zA-Z]", word)) {
				sb.append(s.substring(1));
				sb.append(s.charAt(0)).append("ay");
			} else {
				sb.append(s);
			}
			sb.append(" ");
		}

		return sb.toString().trim();
	}

}
