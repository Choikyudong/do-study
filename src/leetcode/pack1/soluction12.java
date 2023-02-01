package leetcode.pack1;

import java.math.BigInteger;

/**
 * Question : 67. Add Binary
 * Writer : Kyudong
 * Date : 2023-02-01
 * Time : 오후 11:18
 */
public class soluction12 {

	public static void main(String[] args) {
		System.out.println(addBinary("11", "1"));
		System.out.println(addBinary("1010", "1011"));
	}

	/**
	 * 2개의 2진수를 더한다.
	 * @param a 2진수
	 * @param b 2진수
	 * @return 결과값
	 */
	public static String addBinary(String a, String b) {
		BigInteger numA = new BigInteger(a, 2);
		BigInteger numB = new BigInteger(b, 2);
		return numA.add(numB).toString(2);
	}

}
