package baekjoon.pack6;

import java.io.IOException;

public class Soluction4 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		int n = read();
		int m = read();
		System.out.println(gcd(n, m));
		System.out.println((n / gcd(n, m)) * m);
	}

	public static int gcd(int n, int m) {
		while (m != 0) {
			int temp = m;
			m = n % m;
			n = temp;
		}
		return n;
	}

}
