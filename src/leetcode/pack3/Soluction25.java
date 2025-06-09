package leetcode.pack3;

/**
 * <a href="https://leetcode.com/problems/maximum-score-words-formed-by-letters/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Soluction25 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(maxScoreWords(
				new String[]{"dog","cat","dad","good"},
				new char[]{'a','a','c','d','d','d','g','o','o'},
				new int[]{1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0}
		)); // 23

		// 테스트2
		System.out.println(maxScoreWords(
				new String[]{"xxxz","ax","bx","cx"},
				new char[]{'z','a','b','c','x','x','x'},
				new int[]{4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,10}
		)); // 27

		// 테스트3
		System.out.println(maxScoreWords(
				new String[]{"leetcode"},
				new char[]{'l','e','t','c','o','d'},
				new int[]{0,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0}
		)); // 0
	}

	/* 너무 느려서 폐기
	private int max = 0;
	public int maxScoreWords(String[] words, char[] letters, int[] score) {
		int[] letter = new int[26];
		for (char c : letters) {
			letter[c - 97]++;
		}
		max = 0;
		helper(words, letter, score, new boolean[words.length], 0, 0);
		return max;
	}

	private void helper(String[] words, int[] letters, int[] score, boolean[] vistied, int size, int sum) {
		max = Math.max(max, sum);

		if (size == words.length) {
			return;
		}

		for (int i = 0; i < words.length; i++) {
			if (!vistied[i]) {
				vistied[i] = true;
				String word = words[i];
				boolean isCollect = true;
				int currentSum = 0;
				for (int j = 0; j < word.length(); j++) {
					char c = word.charAt(j);
					if (letters[c - 97] > 0) {
						currentSum += score[c - 97];
					} else {
						isCollect = false;
					}
					letters[c - 97]--;
				}
				if (isCollect) {
					helper(words, letters, score, vistied, size + 1, sum + currentSum);
				}

				for (int j = 0; j < word.length(); j++) {
					letters[word.charAt(j) - 97]++;
				}
				vistied[i] = false;
			}
		}
	}
	*/
	

	public static int maxScoreWords(String[] words, char[] letters, int[] score) {
		int[] used = new int[26];
		for (char c : letters) {
			used[c - 97]++;
		}
		return helper(words, used, score, 0);
	}

	private static int helper(String[] words, int[] used, int[] score, int index) {
		if (index == words.length) {
			return 0;
		}

		int max = helper(words, used, score, index + 1);

		String word = words[index];
		boolean canUse = true;
		int[] freq = new int[26];
		int sum = 0;
		for (char c : word.toCharArray()) {
			int idx = c - 'a';
			sum += score[idx];
			freq[idx]++;
			if (freq[idx] > used[idx]) {
				canUse = false;
				break;
			}
		}

		if (canUse) {
			for (int i = 0; i < 26; i++) {
				used[i] -= freq[i];
			}

			max = Math.max(max, sum + helper(words, used, score, index + 1));

			for (int i = 0; i < 26; i++) {
				used[i] += freq[i];
			}
		}

		return max;
	}

}
