package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction23 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());

		// 시간 계산
		int time = Integer.parseInt(br.readLine());
		int hour = time / 3600;
		int minute = (time % 3600) / 60;
		int second = time % 60;

		// 계산된 시간 더하기
		s += second;
		if (s > 59) {
			m += s / 60;
			s %= 60;
		}

		m += minute;
		if (m > 59) {
			h += m / 60;
			m %= 60;
		}

		h += hour;
		if (h >= 24) {
			h %= 24;
		}

		System.out.printf("%d %d %d", h, m, s);
	}

}