package pack3;

/**
 * Question : Sum of Digits / Digital Root
 * Writer : Kyudong
 * Date : 2022-10-27
 * Time : 오후 10:43
 */
public class Soluction4 {

	public static void main(String[] args) {
		System.out.println(digital_root(16));
		System.out.println(digital_root(456));
		System.out.println(digital_root(942));
		System.out.println(digital_root(444223));
	}


	/**
	 * n의 숫자의 합을 취한다. 값이 두 자리 이상이라면 한 자리가 될때까지 반복한다.
	 *
	 * 예시)
	 *     16  ->  1 + 6 = 7
	 *    942  ->  9 + 4 + 2 = 15  ->  1 + 5 = 6
	 * 132189  ->  1 + 3 + 2 + 1 + 8 + 9 = 24  ->  2 + 4 = 6
	 * 493193  ->  4 + 9 + 3 + 1 + 9 + 3 = 29  ->  2 + 9 = 11  ->  1 + 1 = 2
	 *
	 * @param n int형 값
	 * @return 더한 합
	 */
//	public static int digital_root(int n) {
//		int result;
//		while (true) {
//			int sum = 0;
//			String[] arr = String.valueOf(n).split("");
//			for (var str : arr) {
//				sum += Integer.parseInt(str);
//			}
//			if (sum > 9) {
//				n = sum;
//			} else {
//				result = sum;
//				break;
//			}
//		}
//		return result;
//	}

	/**
	 * 수학적?으로 풀면 이렇게 풀 수 있다고 함
	 * 
	 * @param n int형 값
	 * @return 더한 합
	 */
	public static int digital_root(int n) {
		return n != 0 && n % 9 == 0 ? 9 : n % 9;
	}

}
