package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction30 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());

		int time = 0;
		if (0 > a) {
			time += c * (a * -1);
			a = 0;
		}

		if (0 == a) {
			time += d;
		}

		if (b > a) {
			time += (b - a) * e;
		}
		System.out.println(time);
	}

}
