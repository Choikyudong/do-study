package leetcode.pack3;

/**
 * <a href="https://leetcode.com/problems/maximum-compatibility-score-sum/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Soluction6 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(maxCompatibilitySum(
				new int[][] {
						{1, 1, 0}, {1, 0, 1}, {0, 0, 1}
				},
				new int[][] {
						{1, 0, 0}, {0, 0, 1}, {1, 1, 0}
				}
		)); // 8

		// 테스트2
		System.out.println(maxCompatibilitySum(
				new int[][] {
						{0, 0}, {0, 0}, {0, 0}
				},
				new int[][] {
						{1, 1}, {1, 1}, {1, 1}
				}
		)); // 0

		// 테스트2
		System.out.println(maxCompatibilitySum(
				new int[][] {
						{0,1,0,1,1,1}, {1,0,0,1,0,1}, {1,0,1,1,0,0}
				},
				new int[][] {
						{1,0,0,0,0,1}, {0,1,0,0,1,1}, {0,1,0,0,1,1}
				}
		)); // 10
	}

	public static int maxCompatibilitySum(int[][] students, int[][] mentors) {
		return helper(students, mentors, 0, new boolean[students.length], 0);
	}

	private static int helper(int[][] students, int[][] mentors, int index, boolean[] vistied, int score) {
		if (index == students.length) {
			return score;
		}

		int max = 0;
		for (int i = 0; i < mentors.length; i++) {
			if (!vistied[i]) {
				vistied[i] = true;
				int curScore = getScore(students[index], mentors[i]);
				max = Math.max(max, helper(students, mentors, index + 1, vistied, score + curScore));
				vistied[i] = false;
			}
		}

		return max;
	}

	private static int getScore(int[] s, int[] m) {
		int score = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == m[i])  {
				score++;
			}
		}
		return score;
	}

}

