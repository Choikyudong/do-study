package programmers.pack1;

import java.util.Arrays;

public class Soluction27 {

	public static void main(String[] args) {
		System.out.println(solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
		System.out.println(solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
		System.out.println(solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));
	}

	/*
	// 단순 무식하게
	public static int solution(int[][] sizes) {
		for (var nameCard : sizes) {
			Arrays.sort(nameCard);
		}

		int answer = 0;
		for (int[] witdh : sizes) {
			for (int[] height : sizes) {
				answer = Math.max(answer, witdh[0] * height[1]);
			}
		}
		return answer;
	}
	*/

	public static int solution(int[][] sizes) {
		int width = 0;
		int height = 0;
		for (var card : sizes) {
			width = Math.max(width, Math.max(card[0], card[1]));
			height = Math.max(height, Math.min(card[0], card[1]));
		}
		return width * height;
	}
}
