package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction26 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int[] sechedul = new int[101];
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int arrival = Integer.parseInt(st.nextToken());
			int depart = Integer.parseInt(st.nextToken());
			for (int j = arrival; j < depart; j++) {
				sechedul[j]++;
			}
		}

		int money = 0;
		for (int i = 1; i < 101; i++) {
			if (sechedul[i] == 1) {
				money += sechedul[i] * a;
			} else if (sechedul[i] == 2) {
				money += sechedul[i] * b;
			} else if (sechedul[i] == 3) {
				money += sechedul[i] * c;
			}
		}
		System.out.println(money);
	}

}
