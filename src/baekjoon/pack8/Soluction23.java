package baekjoon.pack8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Soluction23 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine()); // 로프 수
		int[] arr = new int[k];
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine()); // 중량
		}

		Arrays.sort(arr);

		int max = 0;
		for (int i = 0; i < k; i++) {
			max = Math.max(max, arr[i]);
			max = Math.max(max, arr[i] * (k - i));
		}
		System.out.println(max);
	}

}
