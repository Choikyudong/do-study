package leetcode.pack5;

/**
 * <a href="https://leetcode.com/problems/count-good-triplets/description/">
 * 문제링크
 * </a>
 */
public class Solution28 {

	public static void main(String[] args) {
		Solution28 solution = new Solution28();

		// 테스트1 : 4
		System.out.println((solution.countGoodTriplets(
				new int[]{3,0,1,1,9,7},
				7,
				2,
				3
		)));

		// 테스트2 : 0
		System.out.println((solution.countGoodTriplets(
				new int[]{1,1,2,2,3},
				0,
				0,
				1
		)));
	}

	public int countGoodTriplets(int[] arr, int a, int b, int c) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (Math.abs(arr[i] - arr[j]) <= a) {
					for (int k = j + 1; k < arr.length; k++) {
						if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
							ans++;
						}
					}
				}
			}
		}

		return ans;
	}

}
