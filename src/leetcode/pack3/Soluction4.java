package leetcode.pack3;

/**
 * <a href="https://leetcode.com/problems/n-th-tribonacci-number/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Soluction4 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(tribonacci(4)); // 4

		// 테스트1
		System.out.println(tribonacci(25)); // 1389537

		System.out.println(tribonacci(37)); // 1389537
	}

	/* 느림
	public static int tribonacci(int n) {
		int[] arr = new int[38];
		arr[1] = 1;
		arr[2] = 1;
		for (int i = 3; i <= n; i++) {
			arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
		}
		return arr[n];
	}
	*/

	// 지저분해 보이지만 속도 차이는 약 3배.
	public static int tribonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}

		int t1 = 0;
		int t2 = 1;
		int t3 = 1;
		int result = t1 + t2 + t3;
		for (int i = 3; i <= n; i++) {
			result = t1 + t2 + t3;
			t1 = t2;
			t2 = t3;
			t3 = result;
		}
		return result;
	}

}

