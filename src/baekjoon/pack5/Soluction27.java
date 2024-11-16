package baekjoon.pack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction27 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] list = br.readLine().split(" ");
		boolean isPass = true;
		for (int i = 1; i <= list.length; i++) {
			int test = Integer.parseInt(list[i - 1]);
			if (test != i) {
				isPass = false;
				break;
			}
		}
		if (isPass) {
			System.out.println("ascending");
		} else {
			isPass = true;
			for (int i = 0, j = 8; i < list.length; i++, j--) {
				int test = Integer.parseInt(list[i]);
				if (test != j) {
					isPass = false;
					break;
				}
			}
			if (isPass) {
				System.out.println("descending");
			} else {
				System.out.println("mixed");
			}
		}
	}

}
