package baekjoon.pack6;

import java.io.IOException;

public class Soluction30 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	private static int[][] arr;
	public static void main(String[] args) throws IOException {
		int N = read();
		arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = read();
			}
		}

		divide(0, 0, N);
		System.out.println(white);
		System.out.println(blue);
	}

	private static int blue = 0;
	private static int white = 0;
	private static void divide(int row, int col, int length) {
		if (length == 1) {
			if (arr[row][col] == 1) {
				blue++;
			} else {
				white++;
			}
			return;
		}

		if (checkColor(row, col, length)) {
			if (arr[row][col] == 1) {
				blue++;
			} else {
				white++;
			}
		} else {
			int half = length / 2;
			divide(row, col, half); // 왼쪽 위
			divide(row, col + half, half); // 오른쪽 위
			divide(row + half, col, half); // 왼쪽 밑
			divide(row + half, col + half, half); // 오른쪽 밑
		}
	}

	private static boolean checkColor(int row, int col, int length) {
		for (int i = row; i < row + length; i++) {
			for (int j = col; j < col + length; j++) {
				if (arr[row][col] != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}
