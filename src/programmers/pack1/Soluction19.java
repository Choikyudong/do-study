package programmers.pack1;

public class Soluction19 {

	public static void main(String[] args) {
		System.out.println(solution(13, 17));
//		System.out.println(solution(1, 1000));
//		System.out.println(solution(24, 27));
		System.out.println(solution(1, 1));
	}

	/*
	public static int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
		}

		return answer;
	}
	*/

	/**
	 * 제곱수(9, 16, 25 등)의 경우 한 쌍을 이루지 않는다.
	 * 그렇기에 현재 수가 제곱수인지 확인을 하면 된다.
	 */
	public static int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i <=  right; i++) {
			if (i % Math.sqrt(i) == 0) {
				answer -= i;
			} else {
				answer += i;
			}
		}

		return answer;
	}

}
