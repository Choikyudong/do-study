package baekjoon.pack4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction18 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		System.out.println(factorial(n) / (factorial(k) * factorial(n - k)));
	}

	private static int factorial(int num) {
		int returnNum = 1;
		for (int i = num; i > 1; i--) {
			returnNum *= i;
		}
		return returnNum;
	}

}
