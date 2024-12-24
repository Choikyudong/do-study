package baekjoon.pack7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Soluction24 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			TreeMap<Integer, Integer> treeMap = new TreeMap<>();
			int K = Integer.parseInt(br.readLine());
			for (int j = 0; j < K; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				String str = st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				if (str.equals("I")) {
					treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
				} else if (!treeMap.isEmpty()) {
					int curNum;
					if (str.equals("D") && num == 1) {
						curNum = treeMap.lastKey();
					} else {
						curNum = treeMap.firstKey();
					}
					int count = treeMap.get(curNum) - 1;
					treeMap.put(curNum, count);
					if (0 >= count) {
						treeMap.remove(curNum);
					}
				}
			}
			if (treeMap.isEmpty()) {
				sb.append("EMPTY");
			} else {
				sb.append(treeMap.lastKey()).append(" ").append(treeMap.firstKey());
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
