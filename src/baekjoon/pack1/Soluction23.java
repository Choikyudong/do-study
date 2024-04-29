package baekjoon.pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Question : 바구니 순서 바꾸기
 * Writer : Kyudong
 * Date : 2023-03-08
 * Time : 오후 10:00
 */
public class Soluction23 {

	// 1 2 3 4 5 6 7 8 9 10
	// 4 5 6 1 2 3 7 8 9 10
	// 4 5 8 9 6 1 2 3 7 10
	// 4 6 1 2 3 7 10 5 8 9
	// 1 4 6 2 3 7 10 5 8 9
	// 1 4 6 2 3 7 10 5 8 9
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		// k부터 j까지의 값을 i에 넣어야 한다.
		int i;
		int j;
		int k;
		int[] temp;
		for (int c = 0; c < m; c++) {
			temp = new int[n];
			st = new StringTokenizer(br.readLine(), " ");
			i = Integer.parseInt(st.nextToken()) - 1;
			j = Integer.parseInt(st.nextToken()) - 1;
			k = Integer.parseInt(st.nextToken()) - 1;
			if (i == k) {
				continue;
			}
			// 임시값 담아두기
			for (int l = k, q = 0; l <= j; l++, q++) {
				temp[q] = arr[l];
			}
			// 값 제거 및 옮기기
			for (int l = i, q = k; l < k; l++, q++) {
				arr[q] = arr[l];
			}
			// 값 담기
			for (int l = i, q = 0; l < k; l++, q++) {
				arr[l] = temp[q];
			}
		}
	}

}
