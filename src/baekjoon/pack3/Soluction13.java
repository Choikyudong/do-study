package baekjoon.pack3;

import java.io.*;

public class Soluction13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		// 1. 도수분포표 생성
		int[] dosu = new int[10001];
		for (int i = 0; i < n; i++) {
			dosu[Integer.parseInt(br.readLine())]++;
		}

		// 2. 결과출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10001; i++) {
			while (dosu[i] > 0) {
				sb.append(i).append("\n");
				--dosu[i];
			}
		}
		bw.write(sb.toString());
		bw.flush();
	}

}
