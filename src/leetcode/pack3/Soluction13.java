package leetcode.pack3;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/?envType=problem-list-v2&envId=greedy">
 * 문제링크
 * </a>
 */
public class Soluction13 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(minMovesToSeat(new int[]{3,1,5}, new int[]{2,7,4})); // 4

		// 테스트2
		System.out.println(minMovesToSeat(new int[]{4,1,5,9}, new int[]{1,3,2,6})); // 7

		// 테스트3
		System.out.println(minMovesToSeat(new int[]{2,2,6,6}, new int[]{1,3,2,6})); // 4
	}

	public static int minMovesToSeat(int[] seats, int[] students) {
		Arrays.sort(seats);
		Arrays.sort(students);

		int result = 0;
		for (int i = 0; i < seats.length; i++) {
			result += Math.abs(seats[i] - students[i]);
		}

		return result;
	}

}
