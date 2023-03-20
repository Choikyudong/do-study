package programmers.pack1;

/**
 * Question : 두 수의 차
 * Writer : Kyudong
 * Date : 2023-03-20
 * Time : 오후 10:12
 */
public class Soluction3 {

	public static void main(String[] args) {
		System.out.println(solution(2, 3));
		System.out.println(solution(100, 2));
	}

	/**
	 * 정수 2개를 빼는데 두개의 수가 -50,000 이하, 50,000 이상일 경우 - 1을 반환
	 * @param num1 int
	 * @param num2 int
	 * @return int 0일경우 제한사항에 걸린 숫자임
	 */
	public static int solution(int num1, int num2) {
		if (num1 > 50000 || num2 > 50000) {
			return 0;
		}
		if (-50000 > num1 || -50000 > num2) {
			return 0;
		}
		return num1 - num2;
	}

}
