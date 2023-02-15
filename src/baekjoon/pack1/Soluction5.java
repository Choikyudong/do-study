package baekjoon.pack1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Question : 개수 세기
 * Writer : Kyudong
 * Date : 2023-02-15
 * Time : 오후 10:56
 */
public class Soluction5 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int length = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		printCountV(arr, Integer.parseInt(br.readLine()));
	}

	/**
	 * 입력받은 배열(arr)값 중에 v와 일치하는 갯수를 출력한다.
	 * @param arr int[]
	 * @param v 찾고자하는 수
	 */
	public static void printCountV(int[] arr, int v) {
		int count = 0;
		for (var n : arr) {
			if (v == n) {
				count++;
			}
		}
		System.out.println(count);
	}

}
