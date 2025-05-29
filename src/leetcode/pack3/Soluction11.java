package leetcode.pack3;

/**
 * <a href="https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/description/?envType=problem-list-v2&envId=greedy">
 * 문제링크
 * </a>
 */
public class Soluction11 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(minPartitions("32")); // 3

		// 테스트2
		System.out.println(minPartitions("82734")); // 8

		// 테스트3
		System.out.println(minPartitions("27346209830709182346")); // 9
	}

	public static int minPartitions(String n) {
		int max = 0;

		for (char c : n.toCharArray()) {
			max = Math.max(max, c - 48);
		}

		return max;
	}

}
