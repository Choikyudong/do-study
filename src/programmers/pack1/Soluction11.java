package programmers.pack1;

/**
 * Question : 중앙값 구하기
 * Writer : Kyudong
 * Date : 2023-03-22
 * Time : 오후 11:24
 */
public class Soluction11 {

	public static void main(String[] args) {
//		System.out.println(solution(new int[]{1,2,7,10,11}));
		System.out.println(solution(new int[]{9,-1,0}));
		System.out.println(solution(new int[]{5,3,3,3,1}));
	}

	/**
	 * array의 중앙값을 구한다.
	 * 제한사항 초과시 0을 반환한다.
	 * @param array int[], 길이는 홀수이다.
	 * @return int array의 중앙값
	 */
	public static int solution(int[] array) {
		int length = array.length;
		if (length > 100 || length < 1) {
			return 0;
		}
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array[length/2];
	}

}
