package programmers.pack1;

import java.util.Arrays;

public class Soluction31 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int a = commands[i][0]; // i
			int b = commands[i][1]; // j
			int c = commands[i][2]; // k
			int[] arr = Arrays.copyOfRange(array, a - 1, b);
			Arrays.sort(arr);
			answer[i] = arr[c - 1];
		}

		return answer;
	}

}
