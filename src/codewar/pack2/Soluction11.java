package codewar.pack2;

import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Question : Descending Order
 * Writer : Kyudong
 * Date : 2022-10-06
 * Time : 오후 11:44
 */
public class Soluction11 {

	public static void main(String[] args) {
		System.out.println(sortDesc(145263));
		System.out.println(sortDesc(42145));
	}

	/**
	 * num의 숫자를 오름차순하여 반환한다.
	 *
	 * 해당 문제에서는 음수는 취급하지 않는다.
	 *
	 * 예시)
	 * Input: 42145 Output: 54421
	 * Input: 145263 Output: 654321
	 * Input: 123456789 Output: 987654321
	 *
	 * @param num int값
	 * @return 오름차순으로 정렬된 숫자
	 */
//	public static int sortDesc(final int num) {
//		String[] strs = String.valueOf(num).split("");
//		int[] nums = new int[strs.length];
//		for (int i = 0; i < strs.length; i++) {
//			int max = Integer.MIN_VALUE;
//			int index = 0;
//			for (int j = 0; j < strs.length; j++) {
//				int value = Integer.parseInt(strs[j]);
//				if (value >= 0 && value > max) {
//					max = value;
//					index = j;
//				}
//			}
//			strs[index] = String.valueOf(Integer.MIN_VALUE);
//			nums[i] = max;
//		}
//		return Integer.parseInt(Arrays.toString(nums).replaceAll("\\D", ""));
//	}

	/**
	 * num의 숫자를 오름차순하여 반환한다.
	 *
	 * @param num int값
	 * @return 오름차순으로 정렬된 숫자
	 */
//	public static int sortDesc(final int num) {
//		int[] arr = new int[String.valueOf(num).length()];
//		int i = 0;
//		for (String str : String.valueOf(num).split("")) {
//			arr[i++] = Integer.parseInt(str);
//		}
//		Arrays.sort(arr);
//		StringBuilder sb = new StringBuilder();
//		for (int j = arr.length - 1; j > -1; j--) {
//			sb.append(arr[j]);
//		}
//		return Integer.parseInt(sb.toString());
//	}

	/**
	 * 스트림을 잘 이용하신 분 따라해봄
	 * 
	 * chars()를 사용훠 변환없이 intstream을 그대로 이용할 경우
	 * 숫자를 문자로 인식하기 때문에 결과값이 이상하게 바뀐다.
	 *
	 * @param num int값
	 * @return 오름차순으로 정렬된 숫자
	 */
	public static int sortDesc(final int num) {
		return Integer.parseInt(String.valueOf(num)
				.chars().mapToObj(n -> String.valueOf(Character.getNumericValue(n)))
				.sorted(Comparator.reverseOrder()).collect(Collectors.joining()));
	}

}
