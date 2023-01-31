package leetcode.pack1;

import java.util.Arrays;

/**
 * Question : 66. Plus One
 * Writer : Kyudong
 * Date : 2023-01-31
 * Time : 오후 11:29
 */
public class Soluction11 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));
		System.out.println(Arrays.toString(plusOne(new int[]{4,3,2,1})));
		System.out.println(Arrays.toString(plusOne(new int[]{9})));
		System.out.println(Arrays.toString(plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})));
		System.out.println(Arrays.toString(plusOne(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6})));
		System.out.println(Arrays.toString(plusOne(new int[]{8,9,9,9})));
	}

	/**
	 * 주어진 배열 digits 숫자에 1을 더하여 반환한다.
	 * 개인적으로는 문제가 뭔가 좀 이상한거 같네요...
	 * @param digits int[]
	 * @return digits + 1
	 */
	public static int[] plusOne(int[] digits) {
		int length = digits.length;
		int n;
		for (int i = length - 1; i > -1; i--) {
			n = digits[i]++;
			if (9 > n) {
				return digits;
			} else {
				digits[i] = 0;
			}
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		digits[1] = 0;
		return digits;
	}

}
