package baekjoon.pack3;

import java.io.*;
import java.util.*;

public class Soluction23 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 1. 포켓몬 도감 목록 저장
		int n = Integer.parseInt(st.nextToken());
		String[] arr = new String[n];
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String pokeMon = br.readLine();
			arr[i] = pokeMon;
			map.put(pokeMon, i + 1);
		}

		// 2. 문제 목록 출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			String test = br.readLine();
			boolean isNumber = 10 > test.charAt(0) - 48;
			if (isNumber) {
				String name = arr[Integer.parseInt(test) - 1];
				sb.append(name);
			} else {
				int index = map.get(test);
				sb.append(index);
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
	}

}
