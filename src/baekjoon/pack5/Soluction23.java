package baekjoon.pack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction23 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		long result = n > m ? n - m : m - n;
		System.out.println(result);
	}

}
