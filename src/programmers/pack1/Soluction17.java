package programmers.pack1;

import java.util.stream.IntStream;

public class Soluction17 {

	public static void main(String[] args) {
		int[] absolutes = new int[]{4, 7, 12};
		boolean[] signs = new boolean[]{true, false, true};
		System.out.println(solution(absolutes, signs));
	}

	public static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for (int i = 0; i < absolutes.length; i++) {
			answer += signs[i] ? absolutes[i] : absolutes[i] * -1;
		}
		return answer;
	}

	/*
	public static int solution(int[] absolutes, boolean[] signs) {
		return IntStream.range(0, absolutes.length)
				.flatMap(i -> IntStream.of(absolutes[i] * (signs[i] ? 1 : -1))).sum();
	}
	*/

}
