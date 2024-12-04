package baekjoon.pack7;

import java.io.IOException;

public class Soluction4 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}
	
	public static void main(String[] args) throws IOException {
		int N = read(); // 세로
		int M = read(); // 가로
		int B = read(); // 블록수
		int[] blocks = new int[N * M];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < blocks.length; i++) {
			int num = read();
			blocks[i] = num;
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		int time = Integer.MAX_VALUE;
		int height = 0;
		for (int i = min; i <= max; i++) {
			int curBlock = B;
			int curTime = 0;
			for (int curBlockHeight : blocks) {
				if (curBlockHeight > i) {
					int workTime = curBlockHeight - i;
					curTime += workTime * 2;
					curBlock += workTime;
				} else if (i > curBlockHeight) {
					int workTime = i - curBlockHeight;
					curTime += workTime;
					curBlock -= workTime;
				}
			}
			if (curBlock > -1 && time >= curTime) {
				time = curTime;
				height = i;
			}
		}
		System.out.println(time + " " + height);
	}

}
