package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description/">
 * 문제링크
 * </a>
 */
public class Solution23 {

	public static void main(String[] args) {
		Solution23 solution = new Solution23();

		// 테스트1 : [5,7,2,3,2]
		System.out.println(solution.findArray(new int[]{5,2,0,3,1}));

		// 테스트2 : [13]
		System.out.println(solution.findArray(new int[]{13}));
	}

	public int[] findArray(int[] pref) {
		int length = pref.length;
		int[] ans = new int[length];

		ans[0] = pref[0];
		for (int i = 1; i < length; i++) {
			ans[i] = pref[i] ^ pref[i - 1];
		}

		return ans;
	}

}
