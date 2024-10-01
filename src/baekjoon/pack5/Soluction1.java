package baekjoon.pack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Soluction1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input;
		while ((input = br.readLine()) != null) {
			int n = Integer.parseInt(input);
			int length = (int) Math.pow(3, n);

			// 모든 구간을 -로 채워놓고 시작한다.
			char[] chars = new char[length];
			Arrays.fill(chars, '-');

			cantorianSet(chars, 0, length);
			System.out.println(new String(chars));
		}
	}

	private static void cantorianSet(char[] result, int start, int length) {
		// 1이 될떄까지 분할한다.
		if (length == 1) {
			return;
		}

		// 3을 나누고 가운데 구간은 공백으로 변경
		int division = length / 3;
		for (int i = start + division; i < start + 2 * division; i++) {
			result[i] = ' ';
		}

		// 왼쪽
		cantorianSet(result, start, division);

		// 오른쪽
		cantorianSet(result, start + 2 * division, division);
	}

}
