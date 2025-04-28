package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction29 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[5];
		int min = 101;
		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			min = Math.min(min, arr[i]);
		}

		int result;
		int number = min;
		while (true) {
			int count = 0;
			for (int i = 0; i < 5; i++) {
				if (number % arr[i] == 0) {
					count++;
				}
			}
			if (count >= 3) {
				result = number;
				break;
			}
			number++;
		}
		System.out.println(result);
	}

}