package programmers.pack1;

import java.util.HashSet;
import java.util.Set;

/**
 * Question : 두 수의 합
 * Writer : Kyudong
 * Date : 2023-03-20
 * Time : 오후 9:58
 */
public class Soluction2 {

	public static void main(String[] args) {
		System.out.println(solution(2, 3));
		System.out.println(solution(100, 2));
	}

	/**
	 * 정수 2개를 더하는데 두개의 수가 -50,000 이하, 50,000 이상일 경우 - 1을 반환
	 * @param num1 int
	 * @param num2 int
	 * @return int -1일경우 제한사항에 걸린 숫자임
	 */
	public static int solution(int num1, int num2) {
		if (num1 > 50000 || num2 > 50000) {
			return -1;
		}
		if (-50000 > num1 || -50000 > num2) {
			return -1;
		}
		return num1 + num2;
	}

}
