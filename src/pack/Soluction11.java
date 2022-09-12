package pack;

/**
 * Question : N-th Power
 * Writer : Kyudong
 * Date : 2022-09-12
 * Time : 오후 11:12
 */
public class Soluction11 {

	public static void main(String[] args) {
		System.out.println(nthPower(new int[] {1,2}, 2));
		System.out.println(nthPower(new int[] {3,1,2,2}, 3));
		System.out.println(nthPower(new int[] {3,1,2}, 2));
	}

	/**
	 * array에서 n 번째에 존재하는 숫자를 n번 곱하여 반환한다.
	 *
	 * @param array 양의 정수 배열
	 * @param n 양의 정수
	 * @return 계산된 int 값
	 */
//	public static int nthPower(int[] array, int n) {
//		if (n >= array.length) {
//			return -1;
//		}
//
//		int result = 0;
//
//		for (int i = 0; i < array.length; i++) {
//			if (i == n) {
//				result = (int) Math.pow(array[i], n);
//			}
//		}
//
//		return result;
//	}

	/**
	 * 다른 사람들처럼 간단하게 삼항연산자로 풀어봄
	 *
	 * @param array 양의 정수 배열
	 * @param n 양의 정수
	 * @return 계산된 int 값
	 */
	public static int nthPower(int[] array, int n) {
		return n >= array.length ? -1 : (int) Math.pow(array[n], n);
	}

}
