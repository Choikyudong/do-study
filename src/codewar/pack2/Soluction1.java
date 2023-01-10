package codewar.pack2;

/**
 * Question :
 * Writer : Kyudong
 * Date : 2022-09-28
 * Time : 오후 11:19
 */
public class Soluction1 {

	public static void main(String[] args) {
		System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
		System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
		System.out.println(findShort("Let's travel abroad shall we"));
	}

	/**
	 * 주어진 문자열에서 가장 짧은 문자열의 길이를 반환한다.
	 *
	 * @param s 문자열
	 * @return 가장 짧은 문자열의 길이
	 */
//	public static int findShort(String s) {
//		String[] arr = s.split(" ");
//		int length = arr[0].length();
//		for (int i = 1; i < arr.length; i++) {
//			if (length > arr[i].length()) {
//				length = arr[i].length();
//			}
//		}
//		return length;
//	}

	/**
	 * 위의 for문을 다르게 사용해봄
	 *
	 * @param s 문자열
	 * @return 가장 짧은 문자열의 길이
	 */
	public static int findShort(String s) {
		int min = Integer.MAX_VALUE; // 수를 비교할 때 첫번째 값으로 좋을지도?
		for (String str : s.split(" ")) {
			if (min > str.length())
				min = str.length();
		}
		return min;
	}

	/**
	 * 해당 문제를 스트림으로 풀어봄
	 *
	 * @param s 문자열
	 * @return 가장 작은 수를 반환하고 값이 이상할 경우 -1을 반환한다.
	 */
//	public static int findShort(String s) {
//		return Arrays.stream(s.split(" "))
//				.mapToInt(String::length)
//				.min().orElse(-1);
//	}



}
