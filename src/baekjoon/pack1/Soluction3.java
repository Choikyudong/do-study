package baekjoon.pack1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Question : 주사위 세개
 * Writer : Kyudong
 * Date : 2023-02-14
 * Time : 오후 11:05
 */
public class Soluction3 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int one = Integer.parseInt(st.nextToken());
		int two = Integer.parseInt(st.nextToken());
		int three = Integer.parseInt(st.nextToken());

		System.out.println(soluction(one, two, three));
	}

	/**
	 * 주사위 3개를 던져 규칙에 따라 상금을 계산한다.
	 * @param one 주사위1
	 * @param two 주사위2
	 * @param three 주사위3
	 * @return 상금
	 */
	public static int soluction(int one, int two, int three) {
		// 다 같은 경우
		if (one == two && one == three) {
			return 10000 + (one * 1000);
		}

		// 2개가 같은 경우
		if (one == two) {
			return 1000 + (one * 100);
		}
		if (one == three) {
			return 1000 + (three * 100);
		}
		if (two == three) {
			return 1000 + (two * 100);
		}

		// 모두 다른 경우
		int max = Math.max(one, two);
		return Math.max(max, three) * 100;
	}

}
