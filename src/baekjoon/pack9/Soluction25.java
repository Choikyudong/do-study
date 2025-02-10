package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction25 {

	public static void main(String[] args) throws IOException {
		int[] cards = new int[21];
		for (int i = 1; i < 21; i++) {
			cards[i] = i;
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 10; // 고정값
		while (n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			for (int i = b, j = a; i > j; i--, j++) {
				int temp = cards[i];
				cards[i] = cards[j];
				cards[j] = temp;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 21; i++) {
			sb.append(cards[i]).append(" ");
		}
		System.out.println(sb);
	}

}
