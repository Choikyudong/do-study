package baekjoon.pack7;

import java.io.IOException;

public class Soluction3 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	private static int[][] arr;
	private static boolean[] vistied;
	public static void main(String[] args) throws Exception {
		int N = read() + 1;
		int M = read();
		arr = new int[N][N];
		vistied = new boolean[N];
		for (int i = 0; i < M; i++) {
			int x = read();
			int y = read();
			arr[x][y] = 1;
			arr[y][x] = 1;
		}

		int count = 0;
		for (int i = 1; i < N; i++) {
			if (!vistied[i]) {
				dfs(i);
				count++;
			}
		}
		System.out.println(count);
	}

	private static void dfs(int x) {
		vistied[x] = true;
		for (int i = 1; i < arr[x].length; i++) {
			if (arr[x][i] == 1 && !vistied[i]) {
				dfs(i);
			}
		}
	}

}
