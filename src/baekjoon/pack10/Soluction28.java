package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction28 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		boolean isWhite = true;
		for (int i = 1; i <= 8; i++) {
			String str = br.readLine();
			for (int j = 0; j < 8; j++) {
				if (isWhite && str.charAt(j) == 'F') {
					count++;
				}
				isWhite = !isWhite;
			}
			isWhite = !isWhite;
		}
		System.out.println(count);
	}

}