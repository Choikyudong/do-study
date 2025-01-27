package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String doorNumber = br.readLine();
		int[] numbers = new int[10];
		for (int i = 0; i < doorNumber.length(); i++) {
			int n = doorNumber.charAt(i) - 48;
			if (n == 6 || n == 9) {
				if (numbers[6] > numbers[9]) {
					numbers[9]++;
				} else {
					numbers[6]++;
				}
			} else {
				numbers[n]++;
			}
		}

		int max = 0;
		for (int i = 0; i < 10; i++) {
			max = Math.max(max, numbers[i]);
		}
		System.out.println(max);
	}

}
