package baekjoon.pack7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int S = Integer.parseInt(br.readLine());
		String str = br.readLine();

		int result = 0;
		int count = 0;
		for (int i = 0; i < S - 2; i++) {
			// OI 패턴을 찾기
			if (str.charAt(i) == 'I' && str.charAt(i + 1) == 'O' && str.charAt(i + 2) == 'I') {
				count++;
				if (count == N) {
					result++;
					count--;
				}
				i++;
			} else {
				count = 0;
			}
		}

		System.out.println(result);
	}

}
