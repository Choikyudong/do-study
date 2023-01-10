package codewar.pack4;

/**
 * Question : Maximum subarray sum
 * Writer : Kyudong
 * Date : 2022-12-27
 * Time : 오후 11:37
 */
public class Soluction4 {

	public static void main(String[] args) {
		System.out.println(sequence(new int[]{}));
		System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
		System.out.println(sequence(new int[]{-2, -3, -1}));
	}

	/**
	 * 배열에서 요소들을 더할 때 가장 큰 값을 구해라
	 * @param arr int[]
	 * @return 빈배열 또는 요소가 음수일때는 0을 반환한다.
	 */
//	public static int sequence(int[] arr) {
//		int result = 0;
//		int compare1;
//		int compare2;
//
//		for (int i = 0; i < arr.length; i++) {
//			compare1 = 0;
//			compare2 = 0;
//			for (int j = i; j < arr.length; j++) {
//				compare1 += arr[j];
//				if (compare1 > compare2)
//					compare2 = compare1;
//			}
//			if (compare2 > result)
//				result = compare2;
//		}
//
//		return result;
//	}

	/**
	 * 풀고나니 카데인 알고리즘이라는 유명한? 문제라고 한다 ㅜ
	 * @param arr int[]
	 * @return 빈배열 또는 요소가 음수일때는 0을 반환한다.
	 */
	public static int sequence(int[] arr) {
		int max = 0;
		int sum = 0;

		for (var i : arr) {
			sum += i;
			max = Math.max(max, sum);
			sum = Math.max(sum, 0);
		}

		return max;
	}

}
