package leetcode.pack1;

/**
 * Question : Reverse String
 * Writer : Kyudong
 * Date : 2023-01-10
 * Time : 오후 9:14
 */
public class Soluction1 {

	public static void main(String[] args) {
		long start = System.nanoTime();

		reverseString(new char[]{'h','e','l','l','o'});
		reverseString(new char[]{'H','a','n','n','a','h'});

		long end = System.nanoTime();
		System.out.println(end - start);
	}

	/**
	 * 전달받은 문자열 s(여기서는 문자열 취급)를 뒤짚어서 반환한다.
	 * 필수) in-place 알고리즘을 적용한다.
	 * @param s 문자열
	 */
	public static void reverseString(char[] s) {
		int length = s.length;
		for (int i = 0, j = length - 1; i < length / 2; i++, j--) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
	}

	/**
	 * 다른 사람의 답을 가져와봄
	 * 필수) in-place 알고리즘을 적용한다.
	 * @param s 문자열
	 */
//	public static void reverseString(char[] s) {
//		int i = 0;
//		int j = s.length - 1;
//		while (i < j) {
//			char temp = s[i];
//			s[i] = s[j];
//			s[j] = temp;
//			i++;
//			j--;
//		}
//	}

}
