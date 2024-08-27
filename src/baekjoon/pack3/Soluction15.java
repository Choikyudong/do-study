package baekjoon.pack3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Soluction15 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] result = new int[n][2];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			result[i][0] = Integer.parseInt(st.nextToken());
			result[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(result, (o1, o2) -> {
			if (o2[0] == o1[0]) {
				return o1[1] - o2[1];
			}
			return o1[0] - o2[0];
		});

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(result[i][0]).append(" ").append(result[i][1]).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
	}

}
