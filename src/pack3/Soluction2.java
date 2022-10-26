package pack3;

/**
 * Question : Create Phone Number
 * Writer : Kyudong
 * Date : 2022-10-26
 * Time : 오후 11:32
 */
public class Soluction2 {

	public static void main(String[] args) {
		System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
	}

	/**
	 * 주어진 배열을 전화번호 형태로 반환한다.
	 *
	 * 예시)
	 * {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} => "(123) 456-7890"
	 *
	 * @param numbers int 배열
	 * @return 전화번호 형태로 반환
	 */
	public static String createPhoneNumber(int[] numbers) {
		StringBuilder sb = new StringBuilder("(");
		for (int i = 0; i < numbers.length; i++) {
			if (i == 3) {
				sb.append(") ");
			}
			if (i == 6) {
				sb.append("-");
			}
			sb.append(numbers[i]);
		}
		return sb.toString();
	}

}
