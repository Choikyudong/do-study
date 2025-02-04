package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Soluction14 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		int result = 0;
		int front = 0;
		int back = n - 1;
		while (front < back) {
			int sum = arr[front] + arr[back];
			if (sum < m) {
				front++;
			} else if (sum > m) {
				back--;
			} else {
				front++;
				back--;
				result++;
			}
		}
		System.out.println(result);
	}

}
