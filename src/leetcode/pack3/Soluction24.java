package leetcode.pack3;

/**
 * <a href="https://leetcode.com/problems/maximum-69-number/description/?envType=problem-list-v2&envId=greedy">
 * 문제링크
 * </a>
 */
public class Soluction24 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(maximum69Number(9669)); // 9969

		// 테스트2
		System.out.println(maximum69Number(9996)); // 9999

		// 테스트3
		System.out.println(maximum69Number(9999)); // 9999
	}

	public static int maximum69Number (int num) {
		StringBuilder sb = new StringBuilder();
		boolean isChanged = false;
		String str = String.valueOf(num);
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '6' && !isChanged) {
				sb.append('9');
				isChanged = true;
			} else {
				sb.append(c);
			}
		}
		return Integer.parseInt(sb.toString());
	}

}
