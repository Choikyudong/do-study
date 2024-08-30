package baekjoon.pack3;

import java.io.*;
import java.util.*;

public class Soluction25 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 1. 듣도 못한 사람 명단 작성
		int n = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(br.readLine(), i);
		}

		// 2. 보도 못한 사람 명단 작성과 함께 듣보잡 목록 작성
		int m = Integer.parseInt(st.nextToken());
		List<String> list = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			String name = br.readLine();
			if (map.containsKey(name)) {
				list.add(name);
			}
		}

		// 3. 듣보잡 목록 정렬 및 출력
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (var name : list) {
			sb.append(name).append("\n");
		}
		bw.write(list.size() + "\n");
		bw.write(sb.toString());
		bw.flush();
	}

}
