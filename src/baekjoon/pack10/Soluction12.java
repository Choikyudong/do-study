package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Soluction12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];

		int sum = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		Arrays.sort(arr);

		for (int i = 0; i < 8; i++) {
			int j = i + 1;
			boolean isCollect = false;
			for (; j < 9; j++) {
				if (sum - (arr[i] + arr[j])  == 100) {
					isCollect = true;
					break;
				}
			}

			if (isCollect) {
				for (int k = 0; k < 9; k++) {
					if (k == i || k == j) {
						continue;
					}
					System.out.println(arr[k]);
				}
				break;
			}
		}
	}

}