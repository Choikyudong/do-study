package programmers.pack1;

public class Soluction13 {

	public static void main(String[] args) {
		System.out.println(solution(1));
		System.out.println(solution(3));
		System.out.println(solution(121));
		System.out.println(solution(576));
	}

	/*
	1부터 제곱근이 될 때까지 더하는 방법
	public static long solution(long n) {
		long answer = -1;
		for (long i = 1; i <= n; i++) {
			if (i * i == n) {
				answer = i;
				break;
			}
		}
		return answer == -1 ? -1 : (answer + 1) * (answer + 1);
	}
	*/

	/**
	 * 자바에서 제공하는 Math 함수를 이용하는 방법
	 * 제곱근을 했을 때 숫자가 나오지 않으면 양의 정수의 제곱이 아니라고 판단한다.
	 */
	public static long solution(long n) {
		if (Math.pow((int) Math.sqrt(n), 2) != n) {
			return -1;
		}
		return (long) Math.pow(Math.sqrt(n) + 1, 2);
	}

}
