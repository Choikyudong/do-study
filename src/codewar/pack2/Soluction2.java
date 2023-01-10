package codewar.pack2;

import java.util.stream.IntStream;

/**
 * Question : Don't give me five!
 * Writer : Kyudong
 * Date : 2022-09-29
 * Time : 오후 11:22
 */
public class Soluction2 {

	public static void main(String[] args) {
		System.out.println(dontGiveMeFive(1,9));
		System.out.println(dontGiveMeFive(4,17));
	}

	/**
	 * 시작값과 끝값에서 5가 들어간 숫자를 제외한 갯수를 반환한다.
	 *
	 * @param start 시작값
	 * @param end 끝값
	 * @return 5가 들어간 숫자를 제외한 갯수
	 */
//	public static int dontGiveMeFive(int start, int end) {
//		int count = 0;
//		for (int i = start; i <= end; i++) {
//			if (String.valueOf(i).contains("5")) {
//				continue;
//			}
//			count++;
//		}
//		return count;
//	}

	/**
	 * 시작값과 끝값에서 5가 들어간 숫자를 제외한 갯수를 반환한다.
	 *
	 * String.matches를 이용 정규식으로 걸러낼 수 있다.
	 *
	 * @param start 시작값
	 * @param end 끝값
	 * @return 5를 제외한 갯수
	 */
	public static int dontGiveMeFive(int start, int end) {
		return (int) IntStream.rangeClosed(start, end)
				.filter(n -> !String.valueOf(n).matches(".*5.*")).count();
	}

}
