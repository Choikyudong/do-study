package baekjoon.pack7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction27 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int calH = 0;
			int calW = 1;
			for (int count = 1; count <= n; count++) {
				if (calH >= h) {
					calH = 1;
					calW++;
				} else {
					calH++;
				}
			}
			sb.append((calH * 100) + calW).append("\n");
		}
		System.out.println(sb);
	}

}
