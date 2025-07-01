package leetcode.pack4;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/description/">
 * 문제링크
 * </a>
 */
public class Solution19 {

	public static void main(String[] args) {
		Solution19 solution = new Solution19();

		// 테스트1 : [0,1]
		System.out.println(solution.getSneakyNumbers(new int[]{0,1,1,0}));

		// 테스트2 : [2,3]
		System.out.println(solution.getSneakyNumbers(new int[]{0,3,2,1,3,2}));
	}

	public int[] getSneakyNumbers(int[] nums) {
		int length = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			int count = map.getOrDefault(num, 0);
			if (count >= 1) {
				length++;
			}
			map.put(num, count + 1);
		}

		int[] ans = new int[length];
		int index = 0;
		for (Integer num :  map.keySet()) {
			if (map.get(num) > 1) {
				ans[index++] = num;
			}
		}

		return ans;
	}

}
