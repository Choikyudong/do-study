package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 수
		int b = Integer.parseInt(st.nextToken()); // 진법
		StringBuilder result = new StringBuilder();
		while (n > 0) {
			int num = n % b;
			char c;
			if (num > 9) {
				c = (char) ((char) num + 55);
				result.append(c);
			} else {
				result.append(num);
			}

			n /= b;
		}
		System.out.println(result.reverse());
	}

}
