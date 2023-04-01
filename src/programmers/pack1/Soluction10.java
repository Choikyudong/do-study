package programmers.pack1;

/**
 * Question : 나머지 구하기
 * Writer : Kyudong
 * Date : 2023-03-22
 * Time : 오후 11:20
 */
public class Soluction10 {

	public static void main(String[] args) {
		System.out.println(solution(3, 2));
		System.out.println(solution(10, 5));
	}

	/**
	 * num1과 num2를 나눈 나머지를 리턴한다.
	 * 제한 범위를 초과시 -1을 반환한다.
	 * @param num1 int
	 * @param num2 int
	 * @return int num1과 num2를 나눈 값
	 */
	public static int solution(int num1, int num2) {
		if (num1 > 100 || num2 > 100) {
			return -1;
		}
		if (1 > num1 || 1 > num2) {
			return -1;
		}
		return num1 % num2;
	}

}
