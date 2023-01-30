package leetcode.pack1;

/**
 * Question : 58. Length of Last Word
 * Writer : Kyudong
 * Date : 2023-01-30
 * Time : 오후 10:09
 */
public class Soluction10 {

	public static void main(String[] args) {
		long start = System.nanoTime();

		System.out.println(lengthOfLastWord("Hello World"));
		System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
		System.out.println(lengthOfLastWord("luffy is still joyboy"));

		long end = System.nanoTime();
		System.out.println(end - start);
	}

	/**
	 * 주어진 문자열(s)의 마지막 단어의 길이를 반환한다.
	 * @param s 공백을 포함하는 문자열
	 * @return index
	 */
//	public static int lengthOfLastWord(String s) {
//		String[] arr = s.split("\\s");
//		return arr[arr.length - 1].length();
//	}

	/**
	 * 다른 방법
	 * 공백을 포함하는 문자열이라고 했으니..
	 * 끝에서부터 공백을 기준으로 잡아보면 된다.
	 * @param s 공백을 포함하는 문자열
	 * @return index
	 */
	public static int lengthOfLastWord(String s) {
		int length = s.length();

		int strLength = 0;
		for (int i = length - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if (c == ' ' && strLength >= 1) {
				break;
			}
			if (c != ' ') {
				strLength++;
			}
		}

		return strLength;
	}

}
