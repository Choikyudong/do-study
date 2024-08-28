package baekjoon.pack3;

import java.io.*;
import java.util.StringTokenizer;

public class Soluction20 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		boolean[] nArr = new boolean[20000001];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			nArr[Integer.parseInt(st.nextToken()) + 10000000] = true;
		}

		int m = Integer.parseInt(br.readLine());
		int[] mArr = new int[m];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) {
			mArr[i] = Integer.parseInt(st.nextToken());
		}

		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < m; i++) {
			int count = nArr[mArr[i] + 10000000] ? 1 : 0;
			sb.append(count).append(" ");
		}
		bw.write(sb.toString());
		bw.flush();
	}

}
