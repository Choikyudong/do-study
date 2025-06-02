package leetcode.pack3;

/**
 * <a href="https://leetcode.com/problems/split-a-string-in-balanced-strings/description/?envType=problem-list-v2&envId=greedy">
 * 문제링크
 * </a>
 */
public class Soluction15 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(balancedStringSplit("RLRRLLRLRL")); // 4

		// 테스트2
		System.out.println(balancedStringSplit("RLRRRLLRLL")); // 2

		// 테스트3
		System.out.println(balancedStringSplit("LLLLRRRR")); // 1
	}

	public static int balancedStringSplit(String s) {
		int count = 0;
		int r = 0;
		int l = 0;
		for (char c : s.toCharArray()) {
			if (c == 'R') {
				r++;
			} else {
				l++;
			}

			if (r == l) {
				count++;
			}
		}

		return count;
	}

}
