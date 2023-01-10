package codewar.pack3;

/**
 * Question : Consecutive strings
 * Writer : Kyudong
 * Date : 2022-12-11
 * Time : PM 10:18
 */
public class Soluction25 {

	public static void main(String[] args) {
		System.out.println(longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
		System.out.println(longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));
		System.out.println(longestConsec(new String[] {}, 3));
		System.out.println(longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));
		System.out.println(longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2));
		System.out.println(longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2));
		System.out.println(longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3));
		System.out.println(longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15));
		System.out.println(longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0));
	}

	/**
	 * 주이진 배열 strarr에서 k만큼 연속된 문자열 중 가장 길이가 긴 문자열을 반환한다.
	 *
	 * @param strarr 배열
	 * @param k 정수
	 * @return 문자열
	 */
	public static String longestConsec(String[] strarr, int k) {
		String result = "";
		StringBuilder sb;
		if (strarr.length > k) {
			for (int i = 0; i < strarr.length; i++) {
				sb = new StringBuilder();
				for (int j = 0; j < k; j++) {
					if (strarr.length > i + j)
						sb.append(strarr[i + j]);
				}
				if (sb.length() > result.length())
					result = sb.toString();
			}
		}
		return result;
	}

}
