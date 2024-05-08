package programmers.pack1;

import java.util.Arrays;

public class Soluction22 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3, 12)));
		System.out.println(Arrays.toString(solution(12, 3)));
		System.out.println(Arrays.toString(solution(2, 5)));
	}

	/**
	 * 최대공약수와 최소공배수 반환
	 * 1 ~ 1000000
	 * @param n 그냥 숫자
	 * @param m 그냥 숫자
	 * @return [최대공약수, 최소공배수]
	 */
	/*
	public static int[] solution(int n, int m) {
		int[] answer = new int[2];

		int max = Math.max(n, m);
		for (int i = 1; i <= max; i++) {
			if (n % i == 0 && m % i == 0) {
				answer[0] = i;
			}
		}

		answer[1] = (n * m) / answer[0];
		return answer;
	}
	*/

	// 유클리드 호제법 구현
	public static int[] solution(int n, int m) {
		int gcd = n;
		int modulo = m;
		while (modulo != 0) {
			int num = gcd % modulo;
			gcd = modulo;
			modulo = num;
		}
		return new int[]{gcd, (n * m) / gcd};
	}

}
