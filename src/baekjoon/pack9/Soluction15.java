package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction15 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		int count = 1;
		int length = 10;
		for (int i = 1; i <= n; i++) {
			if (i == length) {
				count++;
				length = length * 10;
			}
			result += count;
		}
		System.out.println(result);
	}

}
