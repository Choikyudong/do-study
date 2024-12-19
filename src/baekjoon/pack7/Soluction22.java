package baekjoon.pack7;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Soluction22 {

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
		int M = read();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N + M; i++) {
			map.put(read(), read());
		}

		Queue<int[]> queue = new LinkedList<>(); // 현재위치, 횟수
		boolean[] vistied = new boolean[101];
		queue.offer(new int[]{1, 0});
		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int poistion = cur[0];
			int count = cur[1];
			if (poistion == 100) {
				System.out.println(count);
				break;
			}
			for (int diceNum = 1; diceNum < 7; diceNum++) {
				int nextPostion = diceNum + poistion;
				if (100 >= nextPostion && !vistied[nextPostion]) {
					vistied[nextPostion] = true;
					if (map.containsKey(nextPostion)) {
						nextPostion = map.get(nextPostion);
						vistied[nextPostion] = true;
					}
					queue.offer(new int[]{nextPostion, count + 1});
				}
			}
		}
	}

}
