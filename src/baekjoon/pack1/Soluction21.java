package baekjoon.pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Question : 킹, 퀸, 룩, 비숍, 나이트, 폰
 * Writer : Kyudong
 * Date : 2023-03-06
 * Time : 오후 10:28
 */
public class Soluction21 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력받기용
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 검은색 피스
		int[] arr = new int[]{1, 1, 2, 2, 2, 8};

		int index = 0;
		// arr.length 조건문은 혹시라도 st에 잘못 입력을 방지하기 위해서
		while (st.hasMoreTokens() && arr.length > index) {
			// 검은색 피스에 맞춰서 입력받은 피스값을 뺀다.
			System.out.println(arr[index++] - Integer.parseInt(st.nextToken()));
		}
	}

}
