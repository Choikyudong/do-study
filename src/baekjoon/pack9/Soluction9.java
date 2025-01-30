package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Soluction9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int length = str.length();
		String[] strs = new String[length];
		for (int i = 0; i < length; i++) {
			strs[i] = str.substring(i);
		}
		Arrays.sort(strs);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(strs[i]).append("\n");
		}
		System.out.println(sb);
	}

}
