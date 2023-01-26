package codility.pack1;

import java.util.Arrays;

/**
 * Question : Task2 : CyclicRotation
 * Writer : Kyudong
 * Date : 2023-01-26
 * Time : 오후 10:31
 */
public class Soluction2 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{3, 8, 9, 7, 6}, 3)));
		System.out.println(Arrays.toString(solution(new int[]{0, 0, 0}, 1)));
		System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4}, 4)));
	}

	/**
	 * 배열 A의 요소들을 K만큼 오른쪽으로 옮긴다.
	 * 예시)
	 * A = [3, 8, 9, 7, 6], K = 3
	 * 결과 -> [9, 7, 6, 3, 8]
	 * %를 활용해서 풀어보자.
	 * @param A int[]
	 * @param K 이동 횟수
	 * @return int[]
	 */
	public static int[] solution(int[] A, int K) {
		int length = A.length;
		int[] newArr = new int[length];
		for (int i = 0; i < length; i++) {
			newArr[(i + K) % length] = A[i];
		}
		return newArr;
	}

}
