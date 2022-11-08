package pack3;

/**
 * Question : Find The Parity Outlier
 * Writer : Kyudong
 * Date : 2022-11-08
 * Time : 오후 10:17
 */
public class Soluction9 {

	public static void main(String[] args) {
		int[] exampleTest1 = {2,6,8,-10,3};
		int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
		int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
		System.out.println(find(exampleTest1));
		System.out.println(find(exampleTest2));
		System.out.println(find(exampleTest3));
	}

	/**
	 * 배열에서 혼자만 이상한 값을 찾아서 반환한다.
	 *
	 * 예시)
	 * [2, 4, 0, 100, 4, 11, 2602, 36]
	 * Should return: 11 (the only odd number)
	 *
	 * [160, 3, 1719, 19, 11, 13, -21]
	 * Should return: 160 (the only even number)
	 *
	 * @param integers 최소 3의 길이를 가진 정수배열
	 * @return 이상한녀석
	 */
	static int find(int[] integers) {
		int count1 = 0;
		int count2 = 0;
		int e = 0;
		int o = 0;
		for (var i : integers) {
			if (i % 2 == 0) {
				e = i;
				count1++;
			} else {
				o = i;
				count2++;
			}
			if (count1 > 0 && count2 > 0) {
				if (count1 > 1) {
					return o;
				} else if (count2 > 1) {
					return e;
				}
			}
		}

		return count1 > 1 ? o : e;
	}

}
