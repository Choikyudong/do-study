package baekjoon.pack4;

import java.io.*;

public class Soluction2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Long.parseLong(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (long i = 0; i < n; i++) {
			long num = Long.parseLong(br.readLine());
			if (num == 2 || num == 3 || num == 5 || num == 7) {
				sb.append(num);
			} else if (num == 0 || num == 1) {
				sb.append(2);
			} else {
				while (!isPrime(num)) {
					++num;
				}
				sb.append(num);
			}
			sb.append("\n");
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
	}

	private static boolean isPrime(long num) {
		for (int i = 2; i <= Math.sqrt(num); i++){
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
