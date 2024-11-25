package baekjoon.pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction20 {

	public static void main(String[] args) throws IOException {
		int[] arr = new int[12];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		for (int i = 4; i < 12; i++) {
			arr[i] =  arr[i - 3] + arr[i - 2] + arr[i - 1];
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			sb.append(arr[(Integer.parseInt(br.readLine()))]).append('\n');
		}
		System.out.println(sb);
	}

}
