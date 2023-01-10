package codewar.pack1;

/**
 * Question : Find the first non-consecutive number
 * Writer : Kyudong
 * Date : 2022-09-18
 * Time : 오후 11:41
 */
public class Soluction19 {

	public static void main(String[] args) {
		System.out.println(find(new int[]{1, 2, 3, 4, 6, 7, 8}));
		System.out.println(find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
		System.out.println(find(new int[]{4, 6, 7, 8, 9, 11}));
		System.out.println(find(new int[]{4, 5, 6, 7, 8, 9, 11}));
		System.out.println(find(new int[]{31, 32}));
		System.out.println(find(new int[]{-3, -2, 0, 1}));
		System.out.println(find(new int[]{-5, -4, -3, -1}));
	}

	/**
	 * 연속되지 않는 값이 확인하고 연속되지 않는 값을 반환한다.
	 * 모든 수가 연속적으로 존재한다면 null을 반환한다.
	 * 
	 * 예시)
	 * 1,2,3,5,6 <- 5가 연속적이지 않음
	 * return 5
	 *
	 * @param array 오름차순으로 정렬된 int[]
	 * @return null or int
	 */
	static Integer find(final int[] array) {
		int nextNumber = 0;
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				if (array[i] > nextNumber) {
					return array[i];
				}
			}
			nextNumber = array[i] + 1;
		}
		return null;
	}

	/**
	 * stream으로 처리하면 이렇게도 가능할듯
	 *
	 * filter에 저렇게 배열을 할 수 있다.
	 *
	 * @param array 오름차순으로 정렬된 int[]
	 * @return null or int
	 */
//	static Integer find(final int[] array) {
//		return IntStream.range(1, array.length).filter(n -> array[n - 1] != array[n] - 1)
//				.mapToObj(x -> array[x]).findFirst().orElse(null);
//	}

}
