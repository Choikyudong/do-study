package programmers.pack1;

import java.util.Arrays;

public class Soluction18 {

	public static void main(String[] args) {
		int[] numbers = new int[]{1,2,3,4,6,7,8,0};
		System.out.println(solution(numbers));
	}

	/*
	public static int solution(int[] numbers) {
		int answer = 0;
		for (int i = 0; i <= 9; i++) {
			boolean isContain = false;
			for (int number : numbers) {
				if (i == number) {
					isContain = true;
					break;
				}
			}
			if (!isContain) {
				answer += i;
			}
		}
		return answer;
	}
	*/

	/**
	 * 연산범위가 정해져있으니까 다 합친뒤 없는거만 빼는 공식
	 */
	public static int solution(int[] numbers) {
		int answer = 45;
		for (var number : numbers) {
			answer -= number;
		}
		return answer;
	}
}
