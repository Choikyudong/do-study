package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/sum-of-all-odd-length-subarrays/description/">
 * 문제링크
 * </a>
 */
public class Solution14 {

	public static void main(String[] args) {
		Solution14 solution = new Solution14();

		// 테스트1 : 58
		System.out.println((solution.sumOddLengthSubarrays(
				new int[]{1,4,2,5,3}
		)));

		// 테스트2 : 3
		System.out.println((solution.sumOddLengthSubarrays(
				new int[]{1,2}
		)));
	}

	public int sumOddLengthSubarrays(int[] arr) {
		int length = arr.length;
		int sum = 0;

		for (int i = 1; i <= length; i += 2) {
 			for (int j = 0; j <= length - i; j++) {
				for (int k = j, r = 1; r <= i; k++, r++) {
					sum += arr[k];
				}
			}

		}

		return sum;
	}

}
