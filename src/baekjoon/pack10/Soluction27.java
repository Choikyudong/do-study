package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction27 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		n = n - (n % 100);
		int f = Integer.parseInt(br.readLine());
		int result = 0;
		for (int i = 0; i < 99; i++) {
			if ((n + i) % f == 0) {
				result = i;
				break;
			}
		}
		if (result < 10) {
			System.out.println("0" + result);
		} else {
			System.out.println(result);
		}
	}

}