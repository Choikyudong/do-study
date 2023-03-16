package baekjoon.pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Question : 꼬마 정민
 * Writer : Kyudong
 * Date : 2023-03-16
 * Time : 오후 11:53
 */
public class Soluction30 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		long result = 0;
		while (st.hasMoreTokens()) {
			result += Long.parseLong(st.nextToken());
		}

		System.out.println(result);
	}

}
