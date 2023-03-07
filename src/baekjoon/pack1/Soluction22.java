package baekjoon.pack1;

import java.io.*;

/**
 * Question : 별 찍기 - 7
 * Writer : Kyudong
 * Date : 2023-03-07
 * Time : 오후 11:58
 */
public class Soluction22 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int star = Integer.parseInt(br.readLine());

		// 첫번째~
		for (int i = 0; i < star; i++) {
			for (int j = i + 1; j < star; j++) { // 공백
				bw.write(" ");
			}
			for (int j = 0; j < i + 1; j++) { // 왼쪽과 중앙
				bw.write("*");
			}
			for (int j = 0; j < i; j++) { // 오른쪽
				bw.write("*");
			}
			bw.write("\n");
		}

		// 두번째~
		for (int i = 0; i < star - 1; i++) {
			for (int j = 0; j < i + 1; j++) { // 공백
				bw.write(" ");
			}
			for (int j = i; j < star - 1; j++) { // 왼쪽과 중앙
				bw.write("*");
			}
			for (int j = star - 2; j > i; j--) { // 오른쪽
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
	}

}
