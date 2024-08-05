package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		String n = st.nextToken(); // 수
		int b = Integer.parseInt(st.nextToken()); // 진법
		int index = 0;
		long result = 0;
		while (n.length() > index) {
			// 수 구하기
			char c = n.charAt(index);
			int num;
			if (c > 96) {
				num = c - 87;
			} else if (c > 64) {
				num = c - 55;
			} else {
				num = c - 48; // 10(A) 미만의 숫자
			}

			// 거듭제곱
			int count = index + 1;
			long pow = 1;
			while (n.length() - count++ > 0) {
				pow *= b;
			}

			result += num * pow;
			++index;
		}
		System.out.println(result);
	}

}
