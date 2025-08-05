package leetcode.pack6;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/">
 * 문제링크
 * </a>
 */
public class Solution7 {

	public static void main(String[] args) {
		Solution7 solution = new Solution7();

		// 테스트1 : "this is a secret"
		System.out.println(solution.decodeMessage(
				"the quick brown fox jumps over the lazy dog",
				"vkbs bs t suepuv"
		));

		// 테스트2 : "the five boxing wizards jump quickly"
		System.out.println(solution.decodeMessage(
				"eljuxhpwnyrdgtqkviszcfmabo",
				"zwx hnfx lqantp mnoeius ycgk vcnjrdb"
		));
	}

	public String decodeMessage(String key, String message) {
		Map<Character, Character> map = new HashMap<>();
		int index = 0;
		for (char c = 'a'; c <= 'z';) {
			if (map.size() == 26) {
				break;
			}
			char k = key.charAt(index++);
			if (map.containsKey(k) || k == ' ') {
				continue;
			}
			map.put(k, c++);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			char c = message.charAt(i);
			if (c == ' ') {
				sb.append(" ");
				continue;
			}
			sb.append(map.get(c));
		}
		return sb.toString();
	}

}
