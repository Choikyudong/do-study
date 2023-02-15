package baekjoon.pack1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Question : 영수증
 * Writer : Kyudong
 * Date : 2023-02-15
 * Time : 오후 10:38
 */
public class Soluction4 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = Integer.parseInt(br.readLine());
		int kind = Integer.parseInt(br.readLine());

		int sum = 0;
		StringTokenizer st;
		for (int i = 0; i < kind; i++) {
			 st = new StringTokenizer(br.readLine(), " ");
			sum += soluction(st.nextToken(), st.nextToken());
		}

		if (sum == total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	/**
	 * 구입한 물건의 갯수만큼 가격을 반환한다.
	 * @param price 물건의 가격
	 * @param n 갯수
	 * @return int 가격
	 */
	public static int soluction(String price, String n) {
		return Integer.parseInt(price) * Integer.parseInt(n);
	}

}
