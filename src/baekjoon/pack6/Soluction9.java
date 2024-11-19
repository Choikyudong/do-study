package baekjoon.pack6;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Soluction9 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		// 1. n의 값 입력받기
		int n = read();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(read(), 1);
		}

		// 2. m의 값 입력받기
		int m = read();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			sb.append(map.getOrDefault(read(), 0)).append('\n');
		}
		System.out.println(sb);
	}
}
