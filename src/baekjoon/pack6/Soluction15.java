package baekjoon.pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Soluction15 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int[] set = new int[21];
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();
			if (command.equals("all")) {
				Arrays.fill(set, 1);
			} else if (command.equals("empty")) {
				Arrays.fill(set, 0);
			} else {
				int num = Integer.parseInt(st.nextToken());
				switch (command) {
					case "add" :
						set[num] = 1;
						break;
					case "check" :
						sb.append(set[num] == 1 ? 1 : 0).append('\n');
						break;
					case "remove" :
						set[num] = 0;
						break;
					case "toggle" :
						set[num] = set[num] == 1 ? 0 : 1;
						break;
				}
			}
		}
		System.out.println(sb);
	}

}
