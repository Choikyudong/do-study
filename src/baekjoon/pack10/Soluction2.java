package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int p = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (p-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int t = Integer.parseInt(st.nextToken());
			int[] arr = new int[20];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = i; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						count++;
					}
				}
			}
			sb.append(t).append(" ").append(count).append("\n");
		}
		System.out.println(sb);
	}

}
