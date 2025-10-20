package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/final-value-of-variable-after-performing-operations/?envType=daily-question&envId=2025-10-20">
 * 문제링크
 * </a>
 */
public class Solution24 {

	public static void main(String[] args) {
		Solution24 solution = new Solution24();

		// 테스트1 : 1
		System.out.println((solution.finalValueAfterOperations(new String[]{"--X","X++","X++"})));

		// 테스트2 : 3
		System.out.println((solution.finalValueAfterOperations(new String[]{"++X","++X","X++"})));

		// 테스트3 : 0
		System.out.println((solution.finalValueAfterOperations(new String[]{"X++","++X","--X","X--"})));
	}

	public int finalValueAfterOperations(String[] operations) {
		int ans = 0;
		for (String s : operations) {
			ans += s.charAt(1) == '+' ? 1 : -1;
		}
		return ans;
	}

}

