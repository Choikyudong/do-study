package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arrLength = 5;
		char[][] arr = new char[arrLength][]; // 5줄 입력은 고정
		int maxLength = 0;
		for (int i = 0; i < arrLength; i++) {
			String str = br.readLine();
			maxLength = Math.max(maxLength, str.length());
			arr[i] = new char[str.length()];
			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < maxLength; i++) {
			for (char[] strings : arr) {
				if (i >= strings.length) {
					continue;
				}
				result.append(strings[i]);
			}
		}
		System.out.println(result);
	}

}
