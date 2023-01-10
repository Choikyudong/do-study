package codewar.pack2;

/**
 * Question : Square Every Digit
 * Writer : Kyudong
 * Date : 2022-09-30
 * Time : 오후 11:12
 */
public class Soluction3 {

	public static void main(String[] args) {
		System.out.println(squareDigits(9119));
		System.out.println(squareDigits(0));
	}

	/**
	 * 주어진 n의 숫자마다 제곱을 하여 반환한다.
	 *
	 * @param n int
	 * @return int
	 */
	static int squareDigits(int n) {
		String[] arr = String.valueOf(n).split("");

		StringBuilder result = new StringBuilder();
		for (String str : arr) {
			int i = (int) Math.pow(Integer.parseInt(str), 2);
			result.append(i);
		}

		return Integer.parseInt(result.toString());
	}

}
