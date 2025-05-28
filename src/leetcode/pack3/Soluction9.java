package leetcode.pack3;

/**
 * <a href="https://leetcode.com/problems/edit-distance/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Soluction9 {

	public static void main(String[] args) {
		// 테스트1
//		System.out.println(minDistance("horse", "ros")); // 3

		// 테스트2
//		System.out.println(minDistance("intention", "execution")); // 5

		// 테스트3
		System.out.println(minDistance("a", "ab")); // 5
	}


	public static int minDistance(String word1, String word2) {
		int word1Len = word1.length();
		int word2Len = word2.length();
		int[][] dp = new int[word1Len + 1][word2Len + 1];
		for (int i = 1; i <= word1Len; i++) {
			dp[i][0] = i;
		}

		for (int i = 1; i <= word2Len; i++) {
			dp[0][i] = i;
		}

		for (int i = 1; i <= word1Len; i++) {
			for (int j = 1; j <= word2Len; j++) {
				if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = 1 + Math.min(
							dp[i - 1][j - 1],  // 교체
							Math.min(dp[i - 1][j], // 삭제
									dp[i][j - 1]) // 삽입
					);
				}
			}
		}


		return dp[word1Len][word2Len];
	}

}

