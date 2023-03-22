package programmers.pack1;

/**
 * Question : 숫자 비교하기
 * Writer : Kyudong
 * Date : 2023-03-21
 * Time : 오후 10:58
 */
public class Soluction7 {

	public static void main(String[] args) {
		System.out.println(solution(2, 3));
		System.out.println(solution(11, 11));
		System.out.println(solution(7, 99));
	}

	/**
	 * 정수 2개가 주어지고 수가 같다면 1을 반환, 아니라면 -1을 반환
	 * @param num1 int
	 * @param num2 int
	 * @return int
	 */
	public static int solution(int num1, int num2) {
		if (num1 > 10000 || num2 > 10000) {
			return 0;
		}
		if (0 > num1 || 0 > num2) {
			return 0;
		}
		return num1 == num2 ? 1 : -1;
	}

}
