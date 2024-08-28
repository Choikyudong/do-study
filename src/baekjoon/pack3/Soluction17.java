package baekjoon.pack3;

import java.io.*;
import java.util.Arrays;

public class Soluction17 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}

		Arrays.sort(arr, (str1, str2) -> {
			if (str1.length() != str2.length()) {
				return str1.length() - str2.length();
			}
			return str1.compareTo(str2);
		});

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(arr[0] + "\n");
		for (int i = 1; i < n; i++) {
			if (!arr[i].equals(arr[i - 1])) {
				bw.write(arr[i] + "\n");
			}
		}
		bw.flush();
	}

}
