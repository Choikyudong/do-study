package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction18 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int grade = Integer.parseInt(br.readLine());
			if (grade < 40) {
				grade = 40;
			}
			sum += grade;

		}
		System.out.println(sum / 5);
	}

}