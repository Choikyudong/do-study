package baekjoon.pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Soluction22 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			Map<String, Integer> map = new HashMap<>();
			for (int j = 0; j < N; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				st.nextToken(); // 이름인데 어디에 사용할지 모르겠음;;
				String type = st.nextToken();
				map.put(type, map.getOrDefault(type, 0) + 1);
			}
			int sum = 1;
			for (int count : map.values()) {
				sum *= count + 1;
			}
			sb.append(sum - 1).append('\n');
		}
		System.out.println(sb);
	}

}
