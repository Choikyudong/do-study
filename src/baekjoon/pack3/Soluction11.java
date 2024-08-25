package baekjoon.pack3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[5];
		int sum = 0;
		arr[0] = Integer.parseInt(br.readLine());
		sum += arr[0];
		for (int i = 1; i < 5; i++) {
			int n = Integer.parseInt(br.readLine());
			int j;
			for (j = i; j > 0 && arr[j - 1] > n; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = n;
			sum += n;
		}
		System.out.println(sum / 5);
		System.out.println(arr[2]);
	}

}
