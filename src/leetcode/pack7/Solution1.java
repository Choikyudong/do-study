package leetcode.pack7;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/sort-the-students-by-their-kth-score/">
 * 문제링크
 * </a>
 */
public class Solution1 {

	public static void main(String[] args) {
		Solution1 solution1 = new Solution1();

		// 테스트1
		System.out.println(Arrays.deepToString(solution1.sortTheStudents(
				new int[][]{{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}}, 2
		)));

		// 테스트2
		System.out.println(Arrays.deepToString(solution1.sortTheStudents(
				new int[][]{{3, 4}, {5, 6}}, 0
		)));

		// 테스트3
		System.out.println(Arrays.deepToString(solution1.sortTheStudents(
				new int[][]{
						{64766,11978,20502,21365,79611,36797,58431,89540,59373,25955},
						{51305,66104,88468,5333,17233,32521,14087,42738,46669,65662},
						{93306,92793,54009,9715,24354,24895,20069,93332,73836,64359},
						{23358,84599,4675,20979,76889,34630,64098,23468,71448,17848},
				}, 5
		)));
	}

	public int[][] sortTheStudents(int[][] score, int k) {
		for (int i = 1; i < score.length; i++) {
			int index = i;
			while (index > 0) {
				int prevNum = score[index - 1][k];
				int kNum = score[index][k];

				if (kNum < prevNum) {
					break;
				}

				for (int j = 0; j < score[index].length; j++) {
					int temp = score[index - 1][j];
					score[index - 1][j] = score[index][j];
					score[index][j] = temp;
				}
				index--;
			}
		}

		return score;
	}

}
