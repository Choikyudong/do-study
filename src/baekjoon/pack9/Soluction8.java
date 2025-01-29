package baekjoon.pack9;

import java.util.Scanner;

public class Soluction8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		int[] arr = new int[10];
		int sum = 0;
		for (int i = 0; i < n.length(); i++) {
			int num = n.charAt(i) - 48;
			arr[num]++;
			sum += num;
		}

		if (arr[0] == 0 || sum % 3 != 0) {
			System.out.println(-1);
			return;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 9; i >= 0; i--) {
			while (arr[i]-- > 0) {
				sb.append(i);
			}
		}
		System.out.println(sb);
	}

}
