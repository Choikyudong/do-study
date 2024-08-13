package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction22 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int compX1 = Integer.parseInt(st.nextToken());
		int compY1 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int compX2 = Integer.parseInt(st.nextToken());
		int compY2 = Integer.parseInt(st.nextToken());

		int result1 = x;
		if (x == compX1) {
			result1 = compX2;
		} else if (x == compX2) {
			result1 = compX1;
		}

		int result2 = y;
		if (y == compY1) {
			result2 = compY2;
		} else if (y == compY2) {
			result2 = compY1;
		}
		System.out.printf("%d %d", result1, result2);
	}

}
