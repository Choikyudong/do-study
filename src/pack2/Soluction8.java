package pack2;

import java.util.Arrays;

/**
 * Question : Highest and Lowest
 * Writer : Kyudong
 * Date : 2022-10-05
 * Time : 오후 10:13
 */
public class Soluction8 {

	public static void main(String[] args) {
		System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
		System.out.println(highAndLow("1 2 3"));
	}

	/**
	 * 주어진 문자열에서 가장 큰 값과 작은 값을 찾는다.
	 *
	 * 예시)
	 * "1 2 3 4 5" -> return "5 1"
	 *
	 * @param numbers 숫자들
	 * @return 문자열에서 찾은 큰 값과 작은 값 문자열
	 */
//	public static String highAndLow(String numbers) {
//		String[] strs = numbers.split("\\s");
//		int[] arr = new int[strs.length];
//
//		for (int i = 0; i < strs.length; i++) {
//			arr[i] = Integer.parseInt(strs[i]);
//		}
//
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
//		for (int i : arr) {
//			if (i > max) max = i;
//			if (min > i) min = i;
//		}
//
//		return String.format("%d %d", max, min);
//	}

	/**
	 * 주어진 문자열에서 가장 큰 값과 작은 값을 찾는다.
	 *
	 * 예시)
	 * "1 2 3 4 5" -> return "5 1"
	 *
	 * @param numbers 숫자들
	 * @return 문자열에서 찾은 큰 값과 작은 값 문자열
	 */
//	public static String highAndLow(String numbers) {
//		int max = Arrays.stream(numbers.split("\\s"))
//				.mapToInt(Integer::parseInt).max().orElseThrow(IllegalArgumentException::new);
//
//		int min = Arrays.stream(numbers.split("\\s"))
//				.mapToInt(Integer::parseInt).min().orElseThrow(IllegalArgumentException::new);
//
//		return String.format("%d %d", max, min);
//	}

	/**
	 * 다른 사람들 보다가 첨봐서 가져와봄
	 *
	 * var 키워드를 언제 써야할지 감이 안왔는데 해당 코드를 보니 조금 감이 온다.
	 *
	 * 예시)
	 * "1 2 3 4 5" -> return "5 1"
	 *
	 * @param numbers 숫자들
	 * @return 문자열에서 찾은 큰 값과 작은 값 문자열
	 */
	public static String highAndLow(String numbers) {
		var result = Arrays.stream(numbers.split("\\s"))
				.mapToInt(Integer::parseInt).summaryStatistics();

		return String.format("%d %d", result.getMax(), result.getMin());
	}

}
