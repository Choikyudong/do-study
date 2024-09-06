package baekjoon.pack4;

import java.io.*;
import java.util.StringTokenizer;

public class Soluction12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		StringBuilder sb = new StringBuilder();
		sb.append("<");
		int index = 0;
		int eNum = 0;
		while (n > eNum) {
			int count = 0;
			while (count != k) {
				++count;
				if (index >= n) {
					index = 0;
				}
				for (int i = 0; i < n; i++) {
					if (index >= n) {
						index = 0;
					}
					if (arr[index] == 0) {
						++index;
					} else {
						break;
					}
				}
				int num = arr[index];
				if (count == k && num != 0) {
					arr[index] = 0;
					sb.append(num);
					++eNum;
				}
				++index;
			}
			if (eNum == n) {
				sb.append(">");
			} else {
				sb.append(", ");
			}
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
	}

}
