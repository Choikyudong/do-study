package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction28 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int[] b = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			b[i] = i;
		}

		int m = Integer.parseInt(st.nextToken());
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int begin = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int mid = Integer.parseInt(st.nextToken());

			// 복사 배열 인덱스
			int idx = 0;

			// 뒷 부분
			int[] temp = new int[end - begin + 1];
			for (int i = mid; i <= end; i++) {
				temp[idx++] = b[i];
			}

			// 앞 부분
			for (int i = begin; i < mid; i++) {
				temp[idx++] =  b[i];
			}

			// 배열 합치기
			for (int i = 0; i < temp.length; i++) {
				b[begin + i] = temp[i];
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append(b[i]).append(" ");
		}
		System.out.println(sb);
	}

}
