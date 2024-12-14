package baekjoon.pack7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Soluction14 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());;
		PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
			int absA = Math.abs(a);
			int absB = Math.abs(b);
			return absA == absB ? Integer.compare(a, b) : Integer.compare(absA, absB);
		});

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());;
			if (num == 0) {
				if (queue.isEmpty()) {
					sb.append(0).append('\n');
				} else {
					sb.append(queue.poll()).append('\n');
				}
			} else {
				queue.add(num);
			}
		}
		System.out.println(sb);
	}

}
