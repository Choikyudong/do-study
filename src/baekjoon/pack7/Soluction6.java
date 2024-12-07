package baekjoon.pack7;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Soluction6 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		int N = read();
		int[] tangtang = new int[N];
		for (int i = 0; i < N; i++) {
			int tang = read();
			tangtang[i] = tang;
		}

		int result = 0;
		int start = 0;
		Map<Integer, Integer> tangCount = new HashMap<>();
		for (int end = 0; end < N; end++) {
			tangCount.put(tangtang[end], tangCount.getOrDefault(tangtang[end], 0) + 1);

			// 과일 개수가 2개가 될 떄까지
			while (tangCount.size() > 2) {
				tangCount.put(tangtang[start], tangCount.get(tangtang[start]) - 1);
				if (tangCount.get(tangtang[start]) == 0) {
					tangCount.remove(tangtang[start]);
				}
				start++;
			}
			result = Math.max(result, end - start + 1);
		}
		System.out.println(result);
	}

}
