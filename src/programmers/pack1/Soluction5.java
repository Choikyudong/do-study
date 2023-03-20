package programmers.pack1;

/**
 * Question : 몫 구하기
 * Writer : Kyudong
 * Date : 2023-03-20
 * Time : 오후 10:21
 */
public class Soluction5 {

	public static void main(String[] args) {
		System.out.println(solution(10, 5));
		System.out.println(solution(7, 2));
	}

	/**
	 * 정수 2개를 나누는데 두개의 수가 0 미만, 100 초과 경우 0을 반환
	 * @param num1 int
	 * @param num2 int
	 * @return int 0일경우 제한사항에 걸린 숫자임
	 */
	public static int solution(int num1, int num2) {
		if (num1 >= 100 || num2 >= 100) {
			return 0;
		}
		if (1 > num1 || 1 > num2) {
			return 0;
		}
		return num1 / num2;
	}

}
