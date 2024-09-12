package baekjoon.pack4;

import java.io.*;
import java.util.*;

public class Soluction13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1. 원본 순서 저장
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int input = Integer.parseInt(st.nextToken());
			arr[i] = input;
		}

		// 2. 배열을 순회하면서 터뜨린다.
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int index = 0;
		int remaining = n;
		while (remaining > 0) {
			int move = arr[index];
			sb.append(index + 1);
			arr[index] = 0; // 풍선 터뜨리기
			remaining--;

			if (remaining == 0) {
				break;
			} else {
				sb.append(" ");
			}

			// 풍선을 터뜨릴 위치를 찾는다.
			if (move > 0) {
				for (int i = 0; i < move; i++) {
					do {
						index = (index + 1) % n;
					} while (arr[index] == 0);
				}
			} else {
				for (int i = 0; i < -move; i++) {
					do {
						index = (index - 1 + n) % n;
					} while (arr[index] == 0);
				}
			}
		}

		bw.write(sb.toString());
		bw.flush();
	}

}
