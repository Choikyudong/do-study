package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction23 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int[] arr = new int[4];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		while (m-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int tempX = arr[x];
			int tempY = arr[y];
			arr[x] = tempY;
			arr[y] = tempX;
		}

		int result = -1;
		for (int i = 1; i < 4; i++) {
			if (arr[i] == 1) {
				result = i;
			}
		}
		System.out.println(result);
	}

}
