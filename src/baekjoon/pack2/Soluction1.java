package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Question : 최댓값
 * Writer : Kyudong
 * Date : 2023-03-17
 * Time : 오후 11:20
 */
public class Soluction1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = 0; // 행
		int y; // 열
		StringTokenizer st; // 행에 들어갈 숫자 받기용
		int max = 0; // 최대값
		int compare; // 최대값이랑 비교용
		int[] arr = new int[3]; // 해당 배열에 최대값, 행, 열 값 저장함
		for (int i = 0; i < 9; i++) {
			x++; // 행을 증가시킴
			y = 0; // 열을 초기화시킴
			st = new StringTokenizer(br.readLine(), " ");
			while (st.hasMoreTokens()) {
				y++; // 열을 증가시킴
				compare = Integer.parseInt(st.nextToken());
				if (compare > max) {
					max = compare;
					arr[0] = max;
					arr[1] = x;
					arr[2] = y;
				}
			}
		}

		System.out.println(arr[0]);
		if (arr[0] == 0) { // 최대값이 0일 경우
			System.out.println(1 + " " + 1);
		} else {
			System.out.print(arr[1] + " " + arr[2]);
		}
	}

}
