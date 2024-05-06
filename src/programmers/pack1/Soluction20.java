package programmers.pack1;

public class Soluction20 {

	public static void main(String[] args) {
		System.out.println(solution(3, 20, 4));
		System.out.println(solution(3, 1000000000, 4));
		System.out.println(solution(1, 10000, 10));
	}

	public static long solution(int price, int money, int count) {
		long answer = 0;

		for (int i = 1; i <= count; i++) {
			int curPrice = price * i;
			answer += curPrice;
		}

		return Math.max(answer - money, 0);
	}

}
