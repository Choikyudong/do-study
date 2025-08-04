package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/">
 * 문제링크
 * </a>
 */
public class Solution4 {

	public static void main(String[] args) {
		Solution4 solution = new Solution4();

		// 테스트1 : true
		System.out.println(solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));

		// 테스트2 : false
		System.out.println(solution.checkIfPangram("leetcode"));
	}

	public boolean checkIfPangram(String sentence) {
		if (sentence.length() < 26) {
			return false;
		}

		for (int i = 'a'; i <= 'z'; i++) {
			if (sentence.indexOf(i) < 0) {
				return false;
			}
		}

		return true;
	}

}
