package baekjoon.pack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Soluction12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			int number = Integer.parseInt(st.nextToken());
			arr[i][0] = i + 1;
			arr[i][1] = number;
		}
		Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));

		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				sum += arr[j][1];
			}
		}
		System.out.println(sum);
	}

}
