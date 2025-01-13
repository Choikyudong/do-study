package baekjoon.pack8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction20 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long s = Long.parseLong(br.readLine());
		long sum = 0;
		long num = 0;

		if (s == 1) {
			System.out.println(1);
			return;
		}

		while (sum + (num + 1) <= s) {
			num++;
			sum += num;
		}

		System.out.println(num);
	}

}
