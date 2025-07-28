package leetcode.pack5;

/**
 * <a href="https://leetcode.com/problems/reverse-prefix-of-word/description/">
 * 문제링크
 * </a>
 */
public class Solution20 {

	public static void main(String[] args) {
		Solution20 solution = new Solution20();

		// 테스트1 : dcbaefd
		System.out.println((solution.reversePrefix("abcdefd", 'd')));

		// 테스트2 : zxyxxe
		System.out.println((solution.reversePrefix("xyxzxe", 'z')));

		// 테스트3 : abcd
		System.out.println((solution.reversePrefix("abcd", 'z')));
	}

	public String reversePrefix(String word, char ch) {
		int index = word.indexOf(ch);
		if (index == -1) {
			return word;
		}

		char[] chars = word.toCharArray();
		for (int i = 0; i <= index; i++) {
			chars[i] = word.charAt(index - i);
		}
		return new String(chars);
	}

}
