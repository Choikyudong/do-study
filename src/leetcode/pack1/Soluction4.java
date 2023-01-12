package leetcode.pack1;

import java.util.Arrays;

/**
 * Question : Palindrome Number
 * Writer : Kyudong
 * Date : 2023-01-12
 * Time : 오후 9:38
 */
public class Soluction4 {

	public static void main(String[] args) {
		System.out.println(isPalindrome(123));
//		System.out.println(isPalindrome(121));
//		System.out.println(isPalindrome(-123));
//		System.out.println(isPalindrome(10));
	}

	/**
	 * 주어진 숫자(x)가 앞 뒤가 같은지 판단한다.
	 * 예시)
	 * 121 -> true
	 * 123 -> false
	 * -121 -> false
	 * @param x 정수
	 * @return 같은 여부
	 */
//	public static boolean isPalindrome(int x) {
//		String[] arr1 = String.valueOf(x).split("");
//		String[] arr2 = new String[arr1.length];
//		for (int i = arr1.length - 1, j = 0; i > -1; i--, j++) {
//			arr2[j] = arr1[i];
//		}
//		return Arrays.equals(arr1, arr2);
//	}

	/**
	 * 다른 사람 답안 참고
	 * <pre>
	 * 풀이)
	 * 숫자를 뒷 자리부터 완성시킨다는 개념으로 접근한다.
	 * 121이라는 숫자가 파라미터로 들어올 때를 생각하여 설명
	 * 우선 while문의 종료 조건 자리수만큼으로 설정한다.
	 * 자리수만큼을 하기 위해서 x /= 10 으로 한 자리씩 제거한다.
	 * 그리고 compare에 compare * 10은 기존에 구한 숫자의 자리수 높이기용
	 * x % 10은 새롭게 추가 될 숫자이다.
	 * 121이라는 숫자로 보자면..
	 * 1) compare = (0 * 10) + (123 % 10) -> 0 + 3
	 * 2) compare = (3 * 10) + (12 % 10) -> 30 + 2
	 * 3) compare = (32 * 10) + (1 % 10) -> 320 + 1
	 * 해당 방법으로 음수를 구하기는 쉽지않아서 if문으로 처리
	 * </pre>
	 * @param x 정수
	 * @return 같은 여부
	 */
	public static boolean isPalindrome(int x) {
		if (0 > x) {
			return false;
		}
		int copy = x;
		int compare = 0;
		while (x > 0) {
			compare = compare * 10 + x % 10;
			x /= 10;
		}
		return compare == copy;
	}

}
