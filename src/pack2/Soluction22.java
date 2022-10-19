package pack2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Question : Two to One
 * Writer : Kyudong
 * Date : 2022-10-19
 * Time : 오후 11:22
 */
public class Soluction22 {

	public static void main(String[] args) {
		System.out.println(longest("aretheyhere", "yestheyarehere"));
		System.out.println(longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
		System.out.println(longest("inmanylanguages", "theresapairoffunctions"));
	}

	/**
	 * s1과 s2를 조합하여 중복값을 제거하고 알파벳 순대로 정렬한다.
	 *
	 * 예시)
	 * a = "xyaabbbccccdefww"
	 * b = "xxxxyyyyabklmopq"
	 * longest(a, b) -> "abcdefklmopqwxy"
	 *
	 * a = "abcdefghijklmnopqrstuvwxyz"
	 * longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
	 *
	 * @param s1 문자열
	 * @param s2 문자열
	 * @return 변환된 문자열
	 */
//	public static String longest (String s1, String s2) {
//		Set<String> set = new HashSet<>();
//		Collections.addAll(set, s1.split(""));
//		Collections.addAll(set, s2.split(""));
//
//		List<String> s = Arrays.stream(set.toArray())
//				.map(String::valueOf).sorted().collect(Collectors.toList());
//
//		return s.toString().replaceAll("[,\\[\\]\\s]" , "");
//	}

	/**
	 * s1과 s2를 조합하여 중복값을 제거하고 알파벳 순대로 정렬한다.
	 *
	 * 위의 로직을 조금 더 쉽고 짧게 바꿔봄
	 *
	 * @param s1 문자열
	 * @param s2 문자열
	 * @return 변환된 문자열
	 */
	public static String longest (String s1, String s2) {
		String[] str = s1.concat(s2).split("");
		Set<String> set = new HashSet<>(List.of(str));
		return set.toString().replaceAll("[,\\[\\]\\s]", "");
	}



}
