package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/">
 * 문제링크
 * </a>
 */
public class Solution6 {

	public static void main(String[] args) {
		Solution6 solution = new Solution6();

		// 테스트1 : 6
		System.out.println(solution.numberOfSteps(14));

		// 테스트2 : 4
		System.out.println(solution.numberOfSteps(8));
	}

	public int numberOfSteps(int num) {
		int count = 0;

		while (num > 0) {
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num -= 1;
			}
			count++;
		}

		return count;
	}

}
