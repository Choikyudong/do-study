package programmers.pack1;

import java.util.stream.IntStream;

public class Soluction14 {

	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4};
		int[] b = new int[]{-3,-1,0,2};
		System.out.println(solution(a, b));
	}

	/*
	public static int solution(int[] a, int[] b) {
		int answer = 0;

		for (int i = 0; i < a.length; i++) {
			answer += a[i] * b[i];
		}

		return answer;
	}
	*/
	public static int solution(int[] a, int[] b) {
		return IntStream.range(0, a.length).map(n -> a[n] * b[n]).sum();
	}

}
