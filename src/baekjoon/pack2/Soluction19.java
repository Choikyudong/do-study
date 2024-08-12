package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction19 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int num = 2;
		while (Math.sqrt(n) > 1) {
			if (n % num == 0) {
				System.out.println(num);
				n /= num;
				continue;
			}
			++num;
		}
	}

}
