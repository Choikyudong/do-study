package pack2;

import java.util.*;

/**
 * Question : Ones and Zeros
 * Writer : Kyudong
 * Date : 2022-10-23
 * Time : 오후 9:04
 */
public class Soluction27 {

	public static void main(String[] args) {
//		System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
		System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,0))));
		System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
//		System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
//		System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));
	}

	/**
	 * 2진수 값으로 이루어진 배열을 요소를 10진수로 반환한다.
	 *
	 * 예시)
	 * [0, 0, 0, 1] ==> 1
	 * [0, 0, 1, 0] ==> 2
	 *
	 * @param binary 2진수 형태로 이루어진 배열
	 * @return 10진수로 변환된 값
	 */
//	public static int ConvertBinaryArrayToInt(List<Integer> binary) {
//		return Integer.parseInt(binary.toString().replaceAll("[\\[\\],\\s+]", ""), 2);
//	}

	/**
	 * 비트 연산을 사용한 예시를 가져와봄
	 * 
	 * @param binary 2진수 형태로 이루어진 배열
	 * @return 10진수로 변환된 값
	 */
	public static int ConvertBinaryArrayToInt(List<Integer> binary) {
		int number = 0;
		for (var bit : binary)
			number = number << 1 | bit;
		return number;
	}

}
