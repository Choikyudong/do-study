package baekjoon.pack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());
		int[] stack = new int[k];
		int pointer = 0;
		for (int i = 0; i < k; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				--pointer; // 스택의 값을 교체할 필요는 없다.
			} else {
				stack[pointer++] = num;
			}
		}

		int result = 0;
		for (int i = 0; i < pointer; i++) {
			result += stack[i];
		}

		System.out.println(result);
	}

}
