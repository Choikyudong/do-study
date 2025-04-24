package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction16 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken()) - 1;
		int y = Integer.parseInt(st.nextToken()) - 1;

		int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = 0;
		for (int i = 0; i < x; i++) {
			sum += (months[i] % 7);
		}

		String[] days = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		int day = (sum + y) % 7;
		System.out.println(days[day]);
	}

}