package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Soluction21 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<Long, Integer> map = new HashMap<>();
		while (n-- > 0) {
			long num = Long.parseLong(br.readLine());
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int max = 0;
		long card = Long.MAX_VALUE;
		for (long key : map.keySet()) {
			int count = map.get(key);
			if (count > max) {
				max = count;
				card = key;
			} else if (count == max) {
				card = Math.min(card, key);
			}
		}
		System.out.println(card);
	}

}
