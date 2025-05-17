package leetcode.pack2;

/**
 * <a href="https://leetcode.com/problems/climbing-stairs/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Soluction23 {

	public static void main(String[] args) {
		// 테스트 1
		System.out.println(climbStairs(2)); // 2

		// 테스트 2
		System.out.println(climbStairs(3)); // 3
	}

	public static int climbStairs(int n) {
		int[] staircase = new int[46];
		staircase[1] = 1;
		staircase[2] = 2;
		for (int i = 3; i < 46; i++) {
			staircase[i] = staircase[i - 2] + staircase[i - 1];
		}
		return staircase[n];
	}

}

