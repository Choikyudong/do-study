package baekjoon.pack3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Soluction26 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int aLength = Integer.parseInt(st.nextToken());
		int bLength = Integer.parseInt(st.nextToken());

		// 1. a 집합에 데이터 저장
		Map<String, Integer> aMap = new HashMap<>();
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < aLength; i++) {
			aMap.put(st.nextToken(), i);
		}

		// 2. b 집합 데이터 저장
		Map<String, Integer> bMap = new HashMap<>();
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < bLength; i++) {
			bMap.put(st.nextToken(), i);
		}

		// 3. a와 b 비교
		int result = 0;
		for (var a : aMap.entrySet()) {
			if (!bMap.containsKey(a.getKey())) {
				++result;
			}
		}

		for (var b : bMap.entrySet()) {
			if (!aMap.containsKey(b.getKey())) {
				++result;
			}
		}
		System.out.println(result);
	}

}
