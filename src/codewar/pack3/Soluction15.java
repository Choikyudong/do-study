package codewar.pack3;

/**
 * Question : Playing with digits
 * Writer : Kyudong
 * Date : 2022-11-24
 * Time : PM 11:56
 */
public class Soluction15 {

	public static void main(String[] args) {
		System.out.println(digPow(89, 1));
		System.out.println(digPow(92, 1));
		System.out.println(digPow(695, 2));
		System.out.println(digPow(1, 1));
		System.out.println(digPow(46288, 3));
	}

	/**
	 * 예시의 조건에 해당하면 값을 반환하고 아닐경우 -1을 반환한다.
	 *
	 * 예시)
	 * 89 --> 8¹ + 9² = 89 * 1
	 * 695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
	 *
	 * @param n 양의정수
	 * @param p 곱할 값
	 * @return 1 = true
	 */
	public static long digPow(int n, int p) {
		String[] arr = String.valueOf(n).split("");
		int sum = 0;
		for (String s : arr) {
			sum += (int) Math.pow(Integer.parseInt(s), p++);
		}
		return sum % n == 0 ? sum / n : -1;
	}

}
