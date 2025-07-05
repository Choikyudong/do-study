package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/add-two-integers/description/">
 * 문제링크
 * </a>
 */
public class Solution26 {

	public static void main(String[] args) {
		Solution26 solution = new Solution26();

		// 테스트1 : [5,7,2,3,2]
		System.out.println(solution.sum(12, 5));

		// 테스트2 : [13]
		System.out.println(solution.sum(-10, 4));
	}

	public int sum(int num1, int num2) {
		return num1 + num2;
	}

}
