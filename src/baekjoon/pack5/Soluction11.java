package baekjoon.pack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction11 {

	static int[] numbers;
	static int[] opers = new int[4];
	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < 4; i++) {
			opers[i] = Integer.parseInt(st.nextToken());
		}
		doOper(numbers[0], 1);
		System.out.println(max);
		System.out.println(min);
	}

	private static void doOper(int curNum, int index) {
		if (index == numbers.length) {
			min = Math.min(min, curNum);
			max = Math.max(max, curNum);
			return;
		}
		for (int j = 0; j < 4; j++) {
			if (opers[j] > 0) {
				opers[j]--;
				if (j == 0) {
					doOper(curNum + numbers[index], index + 1);
				} else if (j == 1) {
					doOper(curNum - numbers[index], index + 1);
				} else if (j == 2) {
					doOper(curNum * numbers[index], index + 1);
				} else {
					doOper(curNum / numbers[index], index + 1);
				}
				opers[j]++; // 복권을 시켜줘야 다른 수식값을 만들 수 있다
			}
		}
	}

}

