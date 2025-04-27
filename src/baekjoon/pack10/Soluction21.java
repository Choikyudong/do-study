package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction21 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		String str = br.readLine();
		int length = str.length();
		for (int i = 0; i < length; i++) {
			int index = (int) str.charAt(i) - 97;
			arr[index] += 1;
		}

		StringBuilder sb = new StringBuilder();
		for (int i : arr) {
			sb.append(i).append(" ");
		}
		System.out.println(sb);
	}

}