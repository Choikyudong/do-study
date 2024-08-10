package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		int result = 2; // 초기 고정값
		for (int i = 0, j = 1; i < repeat; ++i, j <<= 1) {
			result = result + j;
		}
		System.out.print(result * result);
	}

}
