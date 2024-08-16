package algorithm.recursive;

import java.util.Arrays;

public class Recursive2 {

	public static void main(String[] args) {
		towerOfHanoi(3, 1, 3);
		setQueen(0);
		System.out.println(Arrays.toString(pos1));
		eightRockProblem(0);
		System.out.println(Arrays.toString(pos2));
		eightQueenProblem(0);
		System.out.println(Arrays.toString(pos3));
	}

	/**
	 * @param no 원반 수
	 * @param x 기둥
	 * @param y 기둥
	 */
	static void towerOfHanoi(int no, int x, int y) {
		if (no > 1) {
			towerOfHanoi(no - 1, x, 6 - x- y);
		}

		System.out.printf("원반[%d]을 %d 기둥에서 %d 기둥으로 옮김\n", no, x, y);
		if (no > 1) {
			towerOfHanoi(no - 1, 6 - x - y, y);
		}
	}

	static int[] pos1 = new int[8]; // 각 열의 퀸의 위치
	static void setQueen(int i) {
		for (int j = 0; j < pos1.length; j++) {
			pos1[i] = j;
			if (7 > i) {
				setQueen(i + 1);
			}
		}
	}

	static boolean[] flag = new boolean[8]; // 각 열의 퀸의 위치
	static int[] pos2 = new int[8]; // 각 열의 퀸의 위치
	static void eightRockProblem(int i) {
		for (int j = 0; j < pos2.length; j++) {
			if (!flag[j]) {
				pos2[i] = j;
				if (7 > i) {
					flag[j] = true;
					eightRockProblem(i + 1);
					flag[j] = false;
				}
			}
		}
	}

	static boolean[] flagA = new boolean[8]; // 각 행에 퀸을 배치했는지 체크용
	static boolean[] flagB = new boolean[15]; // / 대각선에 퀸을 배치했는지 체크용
	static boolean[] flagC = new boolean[15]; // \ 대각선에 퀸을 배치했는지 체크용
	static int[] pos3 = new int[8]; // 각 열의 퀸의 위치
	static void eightQueenProblem(int i) {
		for (int j = 0; j < pos3.length; j++) {
			if (!flagA[j] && // 가로행 배치 
				!flagB[i + j] && // 대각선 / 배치
				!flagC[i - j + 7]) { // 대각선 \ 배치
				pos3[i] = j;
				if (7 > i) {
					flagA[j] = flagB[i + j] = flagC[i - j + 7] = true;
					eightQueenProblem(i + 1);
					flagA[j] = flagB[i + j] = flagC[i - j + 7] = false;
				}
			}
		}
	}

}
