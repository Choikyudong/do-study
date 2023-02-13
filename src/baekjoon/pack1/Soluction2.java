package baekjoon.pack1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Question : 오븐 시계
 * Writer : Kyudong
 * Date : 2023-02-13
 * Time : 오후 9:53
 */
public class Soluction2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 백준 문제 특성상 이렇게 처리해야함 ㅡㅡ
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int r = Integer.parseInt(br.readLine());

		System.out.println(soluction(h, m, r));
	}

	/**
	 * 요구시간만큼 요리 후 끝나는 시간을 알려준다.
	 * @param h 시간
	 * @param m 분
	 * @param r 요구시간   
	 * @return 요리 완료 시간
	 */
//	public static String soluction(int h, int m, int r) {
//		m += r;
//		if (m >= 60) {
//			h += m / 60;
//			m %= 60;
//		}
//		if (h >= 24) {
//			h %= 24;
//		}
//		return h + " " + m;
//	}

	/**
	 * 조금 더 줄여봄
	 * @param h 시간
	 * @param m 분
	 * @param r 요구시간   
	 * @return 요리 완료 시간
	 */
	public static String soluction(int h, int m, int r) {
		h += (m + r) / 60;
		if (h > 23) {
			h %= 24;
		}
		m = (m + r) % 60;
		return String.format("%d %d", h, m);
	}

}
