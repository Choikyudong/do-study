package baekjoon.pack8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Soluction3 {

	static int N;
	static int M;
	static int[] arr;
	static int[] printArr;
	static boolean[] vistied;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		printArr = new int[M];
		vistied = new boolean[N];

		backTracking(0, 0);
		System.out.println(sb);
	}

	static void backTracking(int depth, int index) {
		if (depth == M) {
			for (int i : printArr) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}

		int before = 0;
		for (int i = index; i < N; i++) {
			if (before != arr[i]) {
				printArr[depth] = arr[i];
				backTracking(depth + 1, i + 1);
			}
			before = arr[i];
		}
	}

}
