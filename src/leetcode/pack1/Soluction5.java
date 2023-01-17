package leetcode.pack1;

/**
 * Question : 14. Longest Common Prefix
 * Writer : Kyudong
 * Date : 2023-01-17
 * Time : 오후 11:12
 */
public class Soluction5 {

	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
		System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
	}

	/**
	 * 주어진 단어 배열에서 공통 접두사를 찾는다.
	 * 참고한 답안인데 찾고 싶은게 "접두사"라는 점을 이용해서
	 * 공통 접두사가 맞을때까지 뒤의 문자들을 제거하는 형식이다.
	 * @param strs 주어진 단어들 String[]
	 * @return 공통 접두사
	 */
	public static String longestCommonPrefix(String[] strs) {
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		return prefix;
	}

}
