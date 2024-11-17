package baekjoon.pack5;

import java.io.IOException;

public class Soluction29 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		int count = read();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			int h = read();
			int w = read();

			int[][] list = new int[h][w];
			int roomNumber = 101;
			for (int j = 0; j < h; j++) {
				for (int k = 0, l = roomNumber; k < w; k++, l++) {
					list[j][k] = l;
				}
				roomNumber += 100;
			}

			int height = -1;
			int width = 0;
			int e = read();
			for (int j = 0; j < e; j++) {
				height++;
				if (height == h) {
					height = 0;
					width++;
				}
			}
			sb.append(list[height][width]).append('\n');
		}
		System.out.println(sb);
	}

}
