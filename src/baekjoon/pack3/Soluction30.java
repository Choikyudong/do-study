package baekjoon.pack3;

import java.io.*;
import java.util.StringTokenizer;

public class Soluction30 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1. 입력값을 받는다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		// 2. 분자와 분모를 이용하여 최대공약수(gcd)를 구한다.
		int molecule = (a * d) + (b * c);
		int denominator = b * d;

		int gcd = molecule;
		int modulo = denominator;
		while (modulo != 0) {
			int num = gcd % modulo;
			gcd = modulo;
			modulo = num;
		}

		// 3. 출력한다.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(molecule / gcd + " " + denominator / gcd);
		bw.flush();
	}

}
