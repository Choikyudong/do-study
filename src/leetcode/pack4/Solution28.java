package leetcode.pack4;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/description/">
 * 문제링크
 * </a>
 */
public class Solution28 {

	public static void main(String[] args) {
		Solution28 solution = new Solution28();

		// 테스트1 : 6
		System.out.println(solution.maxFreqSum("successes"));

		// 테스트2 : 3
		System.out.println(solution.maxFreqSum("aeiaeia"));
	}

	public int maxFreqSum(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		int max1 = 0;
		int max2 = 0;
		for (char c : map.keySet()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				max1 = Math.max(max1, map.get(c));
			} else {
				max2 = Math.max(max2, map.get(c));
			}
		}

		return max1 + max2;
	}

}
