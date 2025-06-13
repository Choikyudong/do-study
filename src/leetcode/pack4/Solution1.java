package leetcode.pack4;

public class Solution1 {

	public static void main(String[] args) {
		Solution1 solution1 = new Solution1();

		// 테스트1
		System.out.println(solution1.countVowelStrings(1)); // 5

		// 테스트1
		System.out.println(solution1.countVowelStrings(2)); // 2

		// 테스트1
		System.out.println(solution1.countVowelStrings(33)); // 66045
	}

	public int countVowelStrings(int n) {
		long numerator = 1;  // 분자
		long denominator = 1;  // 분모

		for (int i = 0; i < 4; i++) {
			numerator *= (n + 4 - i);
			denominator *= (i + 1);
		}

		return (int) (numerator / denominator);
	}

}
