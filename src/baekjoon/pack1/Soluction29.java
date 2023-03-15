package baekjoon.pack1;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Question : 행렬 덧셈
 * Writer : Kyudong
 * Date : 2023-03-15
 * Time : 오후 9:18
 */
public class Soluction29 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int number;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < m; j++) {
				number = arr[i][j] + Integer.parseInt(st.nextToken());
				System.out.print(number + " ");
			}
			System.out.println();
		}
	}

}
