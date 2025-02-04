package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Soluction13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		int max = 0;
		while (n-- > 0) {
			String key = br.readLine();
			int count = map.getOrDefault(key, 0) + 1;
			max = Math.max(max, count);
			map.put(key, count);
		}

		List<String> list = new ArrayList<>();
		for (var key : map.keySet()) {
			if (map.get(key) == max) {
				list.add(key);
			}
		}
		Collections.sort(list);
		System.out.println(list.get(0));
	}

}
