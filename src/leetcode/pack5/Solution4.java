package leetcode.pack5;

import java.util.List;

/**
 * <a href="https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/">
 * 문제링크
 * </a>
 */
public class Solution4 {

	public static void main(String[] args) {
		Solution4 solution1 = new Solution4();

		// 테스트1 : 3
		System.out.println((solution1.countPairs(List.of(-1,1,2,3,1), 2)));

		// 테스트2 : 10
		System.out.println((solution1.countPairs(List.of(-6,2,5,-2,-7,-1,3), -2)));
	}

	public int countPairs(List<Integer> nums, int target) {
		int ans = 0;
		int size = nums.size();
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (nums.get(i) + nums.get(j) < target) {
					ans++;
				}
			}
		}
		return ans;
	}

}
