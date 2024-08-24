package baekjoon.pack3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int result = 0;
		while (n > 0) {
			if (n == 4) {
				result = -1;
				break;
			}
			if (n % 5 != 0) {
				n -= 3;
			} else {
				n -=5;
			}
			++result;
		}
		System.out.println(result);
	}

}
