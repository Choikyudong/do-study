package pack2;

/**
 * Question : Strong Number
 * Writer : Kyudong
 * Date : 2022-09-30
 * Time : 오후 11:36
 */
public class Soluction4 {

	public static void main(String[] args) {
		System.out.println(isStrongNumber(1));
		System.out.println(isStrongNumber(2));
		System.out.println(isStrongNumber(145));
		System.out.println(isStrongNumber(7));
		System.out.println(isStrongNumber(93));
		System.out.println(isStrongNumber(185));
	}

	private static String STRONG = "STRONG!!!!";
	private static String NOT_STRONG = "Not Strong !!";

	/**
	 * 전달받은 num에서 각 자리값들을 제곱시킨 뒤 해당 값의 합이 처음값과 같다면
	 * STRONG을 반환 아니라면 NOT_STRONG을 반환한다.
	 * 
	 * @param num int
	 * @return 계산된 값이 num과 같다면 STRONG을 반환 아니라면 NOT_STRONG을 반환
	 */
	public static String isStrongNumber(int num) {
		String[] arr = String.valueOf(num).split("");
		int result = 0;
		for (String str : arr) {
			result += fatorial(Integer.parseInt(str));
		}
		return result == num ? STRONG : NOT_STRONG;
	}

	static int fatorial(int num) {
		return num <= 1 ? num : fatorial(num - 1) * num;
	}

}
