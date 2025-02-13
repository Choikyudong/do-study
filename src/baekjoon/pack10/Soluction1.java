package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Soluction1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()) - 1;
		int dasoom = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			queue.add(Integer.parseInt(br.readLine()));
		}

		int result = 0;
		while (!queue.isEmpty() && dasoom <= queue.peek()) {
			queue.add(queue.poll() - 1);
			dasoom++;
			result++;
		}
		System.out.println(result);
	}

}
