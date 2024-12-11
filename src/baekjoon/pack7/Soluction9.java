package baekjoon.pack7;

import java.io.IOException;
import java.util.Arrays;

public class Soluction9 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		int N = read();
		int[][] timeList = new int[N][2];
		for (int i = 0; i < N; i++) {
			int start = read();
			int end = read();
			timeList[i][0] = start;
			timeList[i][1] = end;
		}

		Arrays.sort(timeList, (o1, o2) -> {
			// 끝나는 시간을 먼저 확인
			if (o1[1] == o2[1]) {
				return o1[0] - o2[0];
			}
			return o1[1] - o2[1];
		});

		int count = 0;
		int prevTime = 0;
		for (int i = 0; i < N; i++) {
			// 직전 종료시간이 다음 회의 시작 시간보다 빠르다면..
			if (prevTime <= timeList[i][0]) {
				prevTime = timeList[i][1];
				count++;
			}
		}
		System.out.println(count);
	}

}
