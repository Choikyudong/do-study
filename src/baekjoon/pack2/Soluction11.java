package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int roomNum = Integer.parseInt(br.readLine());
		int result = 1;
		for (int i = 1, j = 1; j < roomNum; j += (i * 6), i++) {
			++result;
		}
		System.out.println(result);
	}

}
