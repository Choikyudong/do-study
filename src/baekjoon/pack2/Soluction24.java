package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction24 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int xMax = Integer.MIN_VALUE; // x 좌표 가장 큰 값
		int xMin = Integer.MAX_VALUE; // x 좌표 가장 작은 값
		int yMax = Integer.MIN_VALUE; // y 좌표 가장 큰 값
		int yMin = Integer.MAX_VALUE; // y 좌표 가장 작은 값
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			xMax = Math.max(xMax, x);
			xMin = Math.min(xMin, x);
			yMax = Math.max(yMax, y);
			yMin = Math.min(yMin, y);
		}
		System.out.println((xMax - xMin) * (yMax - yMin));
	}

}
