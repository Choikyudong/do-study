package leetcode.pack3;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-i/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Soluction3 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(getLongestSubsequence(
				new String[]{"e", "a", "b"}, new int[]{0, 0, 1}
		)); // ["e","b"]

		// 테스트1
		System.out.println(getLongestSubsequence(
				new String[]{"a","b","c","d"}, new int[]{1, 0, 1, 1}
		)); // ["a","b","c"]
	}

	public static List<String> getLongestSubsequence(String[] words, int[] groups) {
		List<String> result = new ArrayList<>();
		result.add(words[0]);
		for (int i = 1; i < groups.length; i++) {
			if (groups[i - 1] != groups[i]) {
				result.add(words[i]);
			}
		}

		return result;
	}

}

