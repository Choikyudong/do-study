package baekjoon.pack3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Soluction18 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[][] result = new String[n][2];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			result[i][0] = st.nextToken();
			result[i][1] = st.nextToken();
		}

		Arrays.sort(result, (person1, person2) -> {
			int person1Age = Integer.parseInt(person1[0]);
			int person2Age = Integer.parseInt(person2[0]);
			return person1Age - person2Age;
		});

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(result[i][0]).append(" ").append(result[i][1]).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
	}

}
