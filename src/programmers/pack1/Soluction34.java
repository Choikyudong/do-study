package programmers.pack1;

public class Soluction34 {

	public static void main(String[] args) {
		System.out.println(solution(2, 1, 20));
		System.out.println(solution(3, 1, 20));
		System.out.println(solution(3, 2, 10));
	}

	/**
	 * 콜라문제
	 * @param a 마트에 주어야 하는 병 수
	 * @param b a개를 가져다 주면 마트가 주는 콜라 병 수
	 * @param n 상빈이가 가지고 있는 빈 병의 개수
	 * @return 콜라 수
	 */
	public static int solution(int a, int b, int n) {
		int answer = 0;
		while (n >= a) {
			answer += (n / a) * b; // 교환한 병 수
			n = ((n / a) * b) + (n % a);
		}
		return answer;
	}

	// 해설 : https://blog.naver.com/doctorgu/222992407249
	/*
	public static int solution(int a, int b, int n) {
		return (n > b ? n - b : 0) / (a - b) * b;
	}
	*/
}
