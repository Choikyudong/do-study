package leetcode.pack5;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/generate-binary-strings-without-adjacent-zeros/description/">
 * 문제링크
 * </a>
 */
public class Solution5 {

	public static void main(String[] args) {
		Solution5 solution1 = new Solution5();

		// 테스트1 : ["010","011","101","110","111"]
		System.out.println((solution1.validStrings(3)));

		// 테스트2 : ["0","1"]
		System.out.println((solution1.validStrings(1)));
	}

	public List<String> validStrings(int n) {
		List<String> ans = new ArrayList<>();
		helper(ans, new StringBuilder(), 0, n);
		return ans;
	}

	private void helper(List<String> list, StringBuilder sb, int depth, int n) {
		if (depth == n) {
			list.add(sb.toString());
			return;
		}

		for (int i = 0; i <= 1; i++) {
			if (depth >= 1 && sb.charAt(depth - 1) == '0' && i == 0) {
				continue;
			}
			sb.append(i);
			helper(list, sb, depth + 1, n);
			sb.setLength(depth);
		}
	}

}
