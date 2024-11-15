package baekjoon.pack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction25 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		System.out.println(newOpereation(a, b));
	}

	private static long newOpereation(long a, long b) {
		return (a + b) * (a - b);
	}

}
