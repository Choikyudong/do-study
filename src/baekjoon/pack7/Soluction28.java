package baekjoon.pack7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Soluction28 {

	static int N;
	static int M;
	static int[] printArr;
	static int[] arr;
	static boolean[] vistied;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());

		printArr = new int[M];
		vistied = new boolean[N];
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);


		backTracking(0);
		System.out.println(sb);
	}

	public static void backTracking(int depth) {
		if (depth == M) {
			for (int i : printArr) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!vistied[i]) {
				vistied[i] = true;
				printArr[depth] = arr[i];
				backTracking(depth + 1);
				vistied[i] = false;
			}
		}
	}

}
