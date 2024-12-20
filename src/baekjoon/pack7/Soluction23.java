package baekjoon.pack7;

import java.util.Scanner;

public class Soluction23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		 StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append("*".repeat(i + 1))
				.append(" ".repeat((N - i - 1) * 2))
				.append("*".repeat(i + 1))
				.append("\n");
		}

		for (int i = N - 2; i >= 0; i--) {
			sb.append("*".repeat(i + 1))
				.append(" ".repeat((N - i - 1) * 2))
				.append("*".repeat(i + 1))
				.append("\n");
		}
		System.out.println(sb);
	}

}
