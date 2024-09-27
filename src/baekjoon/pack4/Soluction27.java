package baekjoon.pack4;

import java.io.*;
import java.util.*;

public class Soluction27 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		// 1. 단어 개수 카운트
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			if (input.length() >= m) {
				map.put(input, map.getOrDefault(input, 0) + 1);
			}
		}

		// 2. 단어 저장
		String[] arr = new String[map.size()];
		int idx = 0;
		for (var str : map.keySet()) {
			arr[idx++] = str;
		}

		// 3. 정렬
		Arrays.sort(arr, (str1, str2) -> {
			// 1. 자주 나오는 단어
			int freq1 = map.get(str1);
			int freq2 = map.get(str2);
			if (freq1 != freq2) {
				return Integer.compare(freq2, freq1);
			}

			// 2. 단어 길이
			int str1Length = str1.length();
			int str2Length = str2.length();
			if (str1Length != str2Length) {
				return Integer.compare(str2Length, str1Length);
			}

			// 3. 알파벳 순
			return str1.compareTo(str2);
		});

		// 4. 출력
		StringBuilder sb = new StringBuilder();
		for (var str : arr) {
			sb.append(str).append("\n");
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
	}

}
