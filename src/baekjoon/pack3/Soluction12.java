package baekjoon.pack3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] records = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		records[0] = x;

		for (int i = 1; i < n; i++) {
			x = Integer.parseInt(st.nextToken());
			int j;
			for (j = n - 1; j > 0 &&  x > records[j - 1]; j--) {
				records[j] = records[j - 1];
			}
			records[j] = x;
		}
		System.out.println(records[k - 1]);
	}

}
