package baekjoon.pack4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction25 {

	private static int count = 0;
	private static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		hanoi(n, 1, 2, 3);
		System.out.println(count);
		System.out.println(sb);
	}

	// col1 = 원본 기둥, col2 = 보조 기둥, col3 = 목표 기둥
	private static void hanoi(int n, int col1, int col2, int col3) {
		++count;
		if (n == 1) {
			sb.append(col1).append(" ").append(col3).append("\n");
		} else {
			hanoi(n - 1, col1, col3, col2);
			sb.append(col1).append(" ").append(col3).append("\n");
			hanoi(n - 1, col2, col1, col3);
		}
	}

}
