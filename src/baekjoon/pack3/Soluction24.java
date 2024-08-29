package baekjoon.pack3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Soluction24 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1. 상근이 카드 목록과 카드의 개수를 구한다.
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> cards = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			String card = st.nextToken();
			if (cards.containsKey(card)) {
				cards.put(card, cards.get(card) + 1);
			} else {
				cards.put(card, 1);
			}
		}

		// 2. m개의 카드 목록을 순회하며 상근의 카드 목록을 조회한다.
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			String card = st.nextToken();
			int count = cards.getOrDefault(card, 0);
			sb.append(count).append(" ");
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
	}

}
