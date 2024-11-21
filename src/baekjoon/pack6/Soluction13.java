package baekjoon.pack6;

import java.io.IOException;

public class Soluction13 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		int k = read();
		int n = read();
		int[] arr = new int[k];
		long max = Long.MIN_VALUE;
		for (int i = 0; i < k; i++) {
			int num = read();
			max = Math.max(max, num);
			arr[i] = num;
		}

		long min = 1;
		long result = 0;
		while (max >= min) {
			long count = 0;
			long mid = (min + max) / 2; // 중간 길이를 찾는다.
			for (int num : arr) {
				count += num / mid;
			}

			if (count >= n) {
				min = mid + 1;
				result = Math.max(result, mid); // 최적의 길이 갱신
			} else {
				max = mid - 1;
			}
		}
		System.out.println(result);
	}

}
