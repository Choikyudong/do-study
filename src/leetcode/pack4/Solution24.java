package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/smallest-even-multiple/description/">
 * 문제링크
 * </a>
 */
public class Solution24 {

	public static void main(String[] args) {
		Solution24 solution = new Solution24();

		// 테스트1 : [5,7,2,3,2]
		System.out.println(solution.smallestEvenMultiple(5));

		// 테스트2 : [13]
		System.out.println(solution.smallestEvenMultiple(6));
	}

	public int smallestEvenMultiple(int n) {
		if (n % 2 == 0) {
			return n;
		} else {
			return n * 2;
		}
	}

}
