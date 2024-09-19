package baekjoon.pack4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Soluction19 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		for (int i = 0; i < repeat; i++) {
			String[] input = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int m = Integer.parseInt(input[1]);
			System.out.println(factorial(m).divide(factorial(n).multiply(factorial(m - n))));
		}
	}

	private static BigInteger factorial(int num) {
		BigInteger result = BigInteger.ONE;
		for (int i = num; i > 1; i--) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}

}
