package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/shuffle-string/">
 * 문제링크
 * </a>
 */
public class Solution2 {

	public static void main(String[] args) {
		Solution2 solution1 = new Solution2();

		// 테스트1 : 1
		System.out.println(solution1.restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));

		// 테스트2 : 2
		System.out.println(solution1.restoreString("abc", new int[]{0,1,2}));
	}

	public String restoreString(String s, int[] indices) {
		char[] chars = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			chars[indices[i]] = s.charAt(i);
		}

		return new String(chars);
	}

}
