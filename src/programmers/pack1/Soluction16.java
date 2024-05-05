package programmers.pack1;

public class Soluction16 {

	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
		System.out.println(solution(3));
		System.out.println(solution(1000000));
	}

	public static int solution(int n) {
		int answer = 2;
		while (n % answer != 1) {
			answer++;
		}
		return answer;
	}

}
