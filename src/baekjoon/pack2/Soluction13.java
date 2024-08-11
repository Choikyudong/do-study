package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		/*
			(v - b - 1) : 마지막 날을 제외한 일수 동안 올라가야할 총 높이
			(a - b) : 하루에 올라가는 높이
			(v - b - 1) / (a - b) : 마지막 날을 제외한 나머지 날 동안 올라갸아 하는 총 높이를 하루동안 올라가는 높이로 나눔
		 */
		System.out.printf("%d", ((v - b - 1) / (a - b)) + 1); // + 1 을 하여 마지막 날 포함
	}

}
