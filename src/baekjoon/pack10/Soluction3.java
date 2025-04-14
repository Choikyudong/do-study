package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Soluction3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Deque<Integer> deque = new ArrayDeque<>();
		for (int i = 1; i <= n; i++) {
			deque.add(i);
		}

		int[] targets = new int[m];
		StringTokenizer numbers = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			targets[i] = Integer.parseInt(numbers.nextToken());;
		}

		int move = 0;
		for (int i = 0; i < m; i++) {
			int targetNumber = targets[i];
			if (deque.peek() == targetNumber) {
				deque.poll();
				continue;
			}

			int right = 0;
			for (Integer num : deque) {
				right++;

				if (num == targetNumber) {
					break;
				}
			}

			int left = 0;
			for (Iterator<Integer> it = deque.descendingIterator(); it.hasNext();) {
				left++;
				if (it.next() == targetNumber) {
					break;
				}
			}

			if (right > left) { // 왼쪽 이동이 최소라면
				for (int j = 0; j < left; j++) {
					deque.offerFirst(deque.pollLast());
				}
				move += left;
			} else {
				right--; // right 이동시 0이 기본값이라 -1을 함
				for (int j = 0; j < right; j++) {
					deque.offerLast(deque.pollFirst());
				}
				move += right;
			}
			deque.pollFirst();
		}
		System.out.println(move);
	}

}
