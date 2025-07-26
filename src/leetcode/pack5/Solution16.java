package leetcode.pack5;

/**
 * <a href="https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/">
 * 문제링크
 * </a>
 */
public class Solution16 {

	public static void main(String[] args) {
		Solution16 solution = new Solution16();

		// 테스트1 : 15
		System.out.println((solution.mostWordsFound(
				new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}
		)));

		// 테스트2 : 21
		System.out.println((solution.mostWordsFound(
				new String[]{"please wait", "continue to fight", "continue to win"}
		)));
	}

	public int mostWordsFound(String[] sentences) {
		int ans = 0;
		for (String sentence : sentences) {
			int count = 0;
			for (char c : sentence.toCharArray()) {
				if (c == ' ') {
					count++;
				}
			}
			ans = Math.max(ans, count);
		}
		return ans + 1;
	}

}
