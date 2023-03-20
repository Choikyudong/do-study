package programmers.pack1;

/**
 * Question : 두 수의 곱
 * Writer : Kyudong
 * Date : 2023-03-20
 * Time : 오후 10:14
 */
public class Soluction4 {

	public static void main(String[] args) {
		System.out.println(solution(3, 4));
		System.out.println(solution(27, 19));
	}

	/**
	 * 정수 2개를 곱하는데 두개의 수가 0 미만, 100 초과일 경우 0을 반환
	 * @param num1 int
	 * @param num2 int
	 * @return int 0일경우 제한사항에 걸린 숫자임
	 */
	public static int solution(int num1, int num2) {
		if (num1 > 100 || num2 > 100) {
			return 0;
		}
		if (0 > num1 || 0 > num2) {
			return 0;
		}
		return num1 * num2;
	}

}
