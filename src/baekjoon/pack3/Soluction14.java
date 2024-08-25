package baekjoon.pack3;

import java.io.*;

public class Soluction14 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		boolean[] checkList = new boolean[2000001];
		for (int i = 0; i < n; i++) {
			checkList[Integer.parseInt(br.readLine()) + 1000000] = true;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 2000001; i++) {
			if (checkList[i]) {
				sb.append(i - 1000000).append("\n");
			}
		}
		System.out.print(sb);
	}

}