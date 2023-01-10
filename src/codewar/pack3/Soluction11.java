package codewar.pack3;

/**
 * Question : Persistent Bugger.
 * Writer : Kyudong
 * Date : 2022-11-19
 * Time : 오후 10:54
 */
public class Soluction11 {

	public static void main(String[] args) {
		System.out.println(persistence(39));
		System.out.println(persistence(4));
		System.out.println(persistence(25));
		System.out.println(persistence(999));
	}

	/**
	 * 주어진 정수 n을 한자리 숫자가 될 떄까지 행해지는 횟수를 카운트한다.
	 * 	 *
	 * 	 * 예시)
	 * 	 * 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
	 * 	 * 999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
	 * 4 --> 0 (because 4 is already a one-digit number)
	 *
	 * @param n 양의 정수
	 * @return 횟수
	 */
	public static int persistence(long n) {
		int count = 0;
		while (n > 9) {
			String[] arr = String.valueOf(n).split("");
			int result = 1;
			for (var num : arr) {
				result *= Integer.parseInt(num);
			}
			n = result;
			count++;
		}
		return count;
	}

}
