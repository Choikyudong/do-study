package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/determine-if-string-halves-are-alike/">
 * 문제링크
 * </a>
 */
public class Solution16 {

	public static void main(String[] args) {
		Solution16 solution = new Solution16();

		// 테스트1 : true
		System.out.println((solution.halvesAreAlike("book")));

		// 테스트2 : false
		System.out.println((solution.halvesAreAlike("textbook")));
	}

	public boolean halvesAreAlike(String s) {
		int length = s.length();

		int count1 = 0;
		int count2 = 0;
		int l = 0;
		int r = length - 1;
		for (int i = 0; i < length / 2; i++) {
			char lc = s.charAt(l++);
			if (isAlike(lc)) {
				count1++;
			}
			char rc = s.charAt(r--);
			if (isAlike(rc)) {
				count2++;
			}
		}

		return count1 == count2;
	}

	private boolean isAlike(char c) {
		return switch (c) {
			case 'a', 'A', 'o', 'O', 'e', 'E', 'i', 'I', 'u', 'U' -> true;
			default -> false;
		};
	}

}
