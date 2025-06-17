package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/?envType=problem-list-v2&envId=array">
 * 문제링크
 * </a>
 */
public class Solution6 {

	public static void main(String[] args) {
		Solution6 solution = new Solution6();

		// 테스트1
		System.out.println(solution.finalValueAfterOperations(new String[]{"--X","X++","X++"})); // 1

		// 테스트2
		System.out.println(solution.finalValueAfterOperations(new String[]{"++X","++X","X++"})); // 3

		// 테스트3
		System.out.println(solution.finalValueAfterOperations(new String[]{"X++","++X","--X","X--"})); // 0
	}

	public int finalValueAfterOperations(String[] operations) {
		int x = 0;
		for (String oper : operations) {
			if (oper.contains("+")) {
				x++;
			} else {
				x--;
			}
		}
		return x;
	}
}
