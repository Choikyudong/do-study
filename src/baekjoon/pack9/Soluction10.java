package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Soluction10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][4];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
			arr[i][2] = st.nextToken();
			arr[i][3] = st.nextToken();
		}

		Arrays.sort(arr, (o1, o2) -> {
			int korean1 = Integer.parseInt(o1[1]);
			int korean2 = Integer.parseInt(o2[1]);
			if (korean1 != korean2) {
				return korean2 - korean1;
			}

			int english1 = Integer.parseInt(o1[2]);
			int english2 = Integer.parseInt(o2[2]);
			if (english1 != english2) {
				return english1 - english2;
			}

			int math1 = Integer.parseInt(o1[3]);
			int math2 = Integer.parseInt(o2[3]);
			if (math1 != math2) {
				return math2 - math1;
			}

			return o1[0].compareTo(o2[0]);
		});

		StringBuilder sb = new StringBuilder();
		for (String[] strs : arr) {
			sb.append(strs[0]).append("\n");
		}
		System.out.println(sb);
	}

}
