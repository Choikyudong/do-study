package baekjoon.pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Soluction12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken()); // 문서 개수
			int m = Integer.parseInt(st.nextToken()); // 출력을 원하는 문서 위치

			// 큐에 값 담기
			Queue<int[]> queue = new LinkedList<>();
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) {
				int number = Integer.parseInt(st.nextToken());
				int[] arr = new int[2];
				arr[0] = j;
				arr[1] = number; // 출력 문서 확인용
				queue.offer(arr);
			}

			// 결과값 담기
			int count = 0;
			while (!queue.isEmpty()) {
				int[] cur = queue.poll();
				boolean chk = true; // 중요도가 높은 것이 있는지 여부

				for (int[] curQ : queue) {
					if (curQ[1] > cur[1]) {
						chk = false;
						break;
					}
				}

				if (chk) {
					count++;
					if (cur[0] == m) {
						sb.append(count).append('\n');
						break;
					}
				} else {
					queue.add(cur);
				}
			}
		}
		System.out.println(sb);
	}

}
