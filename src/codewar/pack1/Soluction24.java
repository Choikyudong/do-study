package codewar.pack1;

import java.util.Arrays;

/**
 * Question : To square(root) or not to square(root)
 * Writer : Kyudong
 * Date : 2022-09-20
 * Time : 오후 11:24
 */
public class Soluction24 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(squareOrSquareRoot(new int[] { 4, 3, 9, 7, 2, 1 })));
	}

	/**
	 * 배열에서 제곱근이 아니면 제곱 아니면 반대로 실행
	 *
	 * Math.sqrt(숫자) % 1 == 0 을 하면 제곱근인지 확인
	 *
	 * @param array 정수 배열
	 * @return 정수 배열
	 */
	public static int[] squareOrSquareRoot(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (Math.sqrt(array[i]) % 1 == 0) {
				array[i] = (int) Math.sqrt(array[i]);
			} else {
				array[i] = (int) Math.pow(array[i], 2);
			}
		}
		return array;
	}

}
