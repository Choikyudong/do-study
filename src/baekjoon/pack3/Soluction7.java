package baekjoon.pack3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 1번
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		// 2번
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());


		int denominatorX = a * e - b * d; // 분모 계산 (x의 분모)
		int denominatorY = a * e - b * d; // 분모 계산 (y의 분모)

		int x = 0;
		if (denominatorX != 0) {
			x = (c * e - b * f) / denominatorX;
		}

		int y = 0;
		if (denominatorY != 0) {
			y = (a * f - c * d) / denominatorY;
		}

		System.out.printf("%d %d", x, y);
	}

}
