package pack;

/**
 * Question : uarter of the year
 * Writer : Kyudong
 * Date : 2022-09-25
 * Time : 오후 11:09
 */
public class Soluction26 {

	public static void main(String[] args) {
		System.out.println(quarterOf(1));
		System.out.println(quarterOf(5));
		System.out.println(quarterOf(8));
		System.out.println(quarterOf(11));
	}

	/**
	 *
	 *
	 * @param month 달
	 * @return 분기
	 */
//	public static int quarterOf(int month) {
//		int quarter;
//
//		if (month >= 10) {
//			quarter = 4;
//		} else if (month >= 7) {
//			quarter = 3;
//		} else if (month >= 4) {
//			quarter = 2;
//		} else {
//			quarter = 1;
//		}
//
//		return quarter;
//	}

	/**
	 * 해당 달이 속한 분기를 반환한다.
	 *
	 * 2를 더하여 0으로 값이 떨어지는것을 막고
	 * 분기 계산을 위해서 3을 나눈다.
	 *
	 * @param month 달
	 * @return 분기
	 */
	 public static int quarterOf(int month) {
		return (month + 2) / 3;
	 }

}
