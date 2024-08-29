package baekjoon.pack3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Soluction22 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Map<String, String> employees = new HashMap<>();

		// 1. 이름, 상태 값을 맵에 담기
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken();
			String state = st.nextToken();
			if (employees.containsKey(name)) {
				employees.remove(name);
			} else {
				employees.put(name, state);
			}
		}

		// 2. List로 옮기기
		List<String> result = new ArrayList<>(employees.keySet());

		// 3. 정렬하기
		result.sort(Collections.reverseOrder());

		// 4. 출력
		StringBuilder sb = new StringBuilder();
		for (var employee : result) {
			sb.append(employee).append("\n");
		}
		System.out.print(sb);
	}

}
