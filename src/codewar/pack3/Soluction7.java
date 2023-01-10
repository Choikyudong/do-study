package codewar.pack3;

/**
 * Question : Bit Counting
 * Writer : Kyudong
 * Date : 2022-11-01
 * Time : 오후 11:07
 */
public class Soluction7 {

	public static void main(String[] args) {
		System.out.println(countBits(1234));
		System.out.println(countBits(4));
		System.out.println(countBits(7));
		System.out.println(countBits(9));
		System.out.println(countBits(10));
		System.out.println(countBits(0));
	}

	/**
	 * 주어진 10진수를 2진수로 변환 후 모두 더한값을 반호나한다.
	 * 
	 * @param n 10진수 int
	 * @return 계산된 값
	 */
//	public static int countBits(int n){
//		StringBuilder sb = new StringBuilder();
//		while (n > 0) {
//			sb.append(n % 2);
//			n = n / 2;
//		}
//		int result = 0;
//		if (!sb.toString().isEmpty()) {
//			String[] arr = sb.reverse().toString().split("");
//			for (var str : arr) {
//				result += Integer.parseInt(str);
//			}
//		}
//		return result;
//	}

	/**
	 * 다른 사람들 답안 보고 더 간단하게 만들어봄
	 *
	 * @param n 10진수 int
	 * @return 계산된 값
	 */
	public static int countBits(int n){
		int result = 0;
		do {
			result += n % 2;
		} while ((n >>= 1) > 0);
		return result;
	}

	/**
	 * 물론 자바에서 제공해준다.
	 *
	 * @param n 10진수 int
	 * @return 계산된 값
	 */
//	public static int countBits(int n){
//		return Integer.bitCount(n);
//	}

}
