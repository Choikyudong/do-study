package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());	// 고정지출
		int b = Integer.parseInt(st.nextToken());	// 생산 비용
		int c = Integer.parseInt(st.nextToken());	// 노트북 가격

		if (b >= c) {
			System.out.println(-1);
		} else {
			System.out.println((a / (c - b)) + 1);
		}
	}

}