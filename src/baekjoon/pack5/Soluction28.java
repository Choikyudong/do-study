package baekjoon.pack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction28 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		int c = Integer.parseInt(br.readLine());
		System.out.println(fun(Integer.parseInt(a) + Integer.parseInt(b), c));
		System.out.println(fun(Integer.parseInt(a + b), c));
	}

	private static int fun(int ab, int c) {
		return ab - c;
	}

}
