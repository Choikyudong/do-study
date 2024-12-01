package baekjoon.pack7;

import java.io.IOException;

public class Soluction1 {

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
		int M = read();
		int[] trees = new int[N];
		long max = Long.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			int num = read();
			trees[i] = num;
			max = Math.max(max, num);
		}

		long min = 0;
		while (max > min) { // 이진검색 종료 조건
			// 평균 길이보다 길이가 긴 나무들을 자른다.
			long sum = 0;
			long mid = (min + max) / 2;
			for (int treeH : trees) {
				if (treeH - mid > 0) {
					sum += (treeH - mid);
				}
			}

			// 자른 나무 길이가 구하는 길이보다 길다면 자르는 높이를 높인다.
			if (sum >= M) {
				min = mid + 1;
			} else {
				max = mid;
			}
		}
		System.out.println(min - 1);
	}

}
