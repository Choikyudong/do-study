package baekjoon.pack3;

import java.io.*;
import java.util.StringTokenizer;

public class Soluction28 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1. 입력값을 받는다.
		int t = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int t1 = Integer.parseInt(st.nextToken());
			int t2 = Integer.parseInt(st.nextToken());

			// 2. 최대공약수를 구한다.
			int gcd = Math.max(t1, t2);
			int modulo = Math.min(t1, t2);
			while (modulo != 0) {
				int num = gcd % modulo;
				gcd = modulo;
				modulo = num;
			}

			// 3. 최소공배수를 구한다.
			result.append((t1 * t2) / gcd).append("\n");
		}

		// 4. 출력한다.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(result.toString());
		bw.flush();
	}

}
