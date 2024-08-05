package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[][] totalPapaer = new boolean[100][100];
		int paperCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < paperCount; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for (int j = 0; j < 10; j++, y++) {
				for (int k = x; k < x + 10; k++) {
					totalPapaer[y][k] = true;
				}
			}
		}

		int result = 0;
		for (boolean[] booleans : totalPapaer) {
			for (boolean b : booleans) {
				if (b) {
					++result;
				}
			}
		}
		System.out.println(result);
	}

}
