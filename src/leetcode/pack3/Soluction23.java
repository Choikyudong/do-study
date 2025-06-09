package leetcode.pack3;

/**
 * <a href="https://leetcode.com/problems/maximum-odd-binary-number/description/?envType=problem-list-v2&envId=greedy">
 * 문제링크
 * </a>
 */
public class Soluction23 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(maximumOddBinaryNumber("010")); // "001"

		// 테스트2
		System.out.println(maximumOddBinaryNumber("0101")); // "1001"

		// 테스트3
		System.out.println(maximumOddBinaryNumber("1")); // "1"

		// 테스트3
		System.out.println(maximumOddBinaryNumber("01")); // "01"
	}

	public static String maximumOddBinaryNumber(String s) {
		int one = 0;
		int zero = 0;
		int length = s.length();
		for (int i = 0; i < length; i++) {
			if (s.charAt(i) == '1') {
				one++;
			} else {
				zero++;
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append("1".repeat(one - 1));
		sb.append("0".repeat(zero));
		return sb.append("1").toString();
	}

}
