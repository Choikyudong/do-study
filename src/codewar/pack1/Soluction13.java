package codewar.pack1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Question : If you can't sleep, just count sheep!!
 * Writer : Kyudong
 * Date : 2022-09-13
 * Time : 오후 10:20
 */
public class Soluction13 {

	public static void main(String[] args) {
		System.out.println(countingSheep(0));
		System.out.println(countingSheep(1));
		System.out.println(countingSheep(2));
		System.out.println(countingSheep(3));
	}

	/**
	 * 주어진 num만큼 문자열을 반복해서 반환한다.
	 *
	 * 예시)
	 * num = 3일 때 -> return "1 sheep...2 sheep...3 sheep..."
	 *
	 * @param num 양의 정수
	 * @return 완성된 문자열
	 */
//	public static String countingSheep(int num) {
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < num; i++) {
//			sb.append(i + 1).append(" sheep...");
//		}
//		return sb.toString();
//	}

	/**
	 * 위의 예시를 스트림으로 처리했다.
	 *
	 * Collectors를 이용해서 본인이 반환하고 싶은 타입을 좀 더 편하게 반환가능하다.
	 * 개인적으로는 이렇게 많지 않는 데이터를 다룰 때는
	 * 위의 for문이 가독성과 성능면에서 더 좋은 선택이라고 생각한다.
	 *
	 * @param num 양의 정수
	 * @return 완성된 문자열
	 */
	public static String countingSheep(int num) {
		return IntStream.rangeClosed(1, num)
						.mapToObj(i -> i + " sheep...")
						.collect(Collectors.joining());
	}

}
