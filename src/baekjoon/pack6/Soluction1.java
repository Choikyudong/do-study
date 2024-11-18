package baekjoon.pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction1 {

	public static void main(String[] args) throws IOException {
		// 1. 입력값 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] list = new int[6];
		for (int i = 0; i < 6; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine(), " ");
		int t = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());

		// 2. 셔츠 계산
		int shirtResult = 0;
		for (int i = 0; i < 6; i++) {
			int count = list[i];
			shirtResult += count / t;
			if (count % t != 0) {
				shirtResult++;
			}
		}
		System.out.println(shirtResult);

		// 3. 펜 계산
		System.out.println((n / p) + " " + (n % p));
	}

}
